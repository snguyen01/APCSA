
/**
 * Write a description of class BallRunner here.
 *
 * @Steven Nguyen
 * @Project 2
 */
public class BallRunner
{   
       
    BallWorld world;
    TGPoint entrancePoint;
    BallBot ballBotArray[];
    
   
   public BallRunner(BallWorld area, TGPoint start, int numBalls)
   {
        entrancePoint = start;
        
        world = area;
        
        ballBotArray = new BallBot[numBalls];
   }
   
   // helper method (activity 2)
   public int findFreeBallBotIndex()
   {
        for(int i = 0; i < ballBotArray.length; i++)
        {
            if(ballBotArray[i] == null)
            {
                return i;
            }
        }
        return ballBotArray.length;
   }
   
   // helper method to find distance between 2 points
   public double distanceBetweenPoints(TGPoint point1, TGPoint point2)
   {
       double x,y, distance;
       
       // delta x, y:
       x = point2.x - point1.x;
       y = point2.y - point1.y;
       
       //pyth th:
       distance = Math.sqrt( (x*x) + (y*y));
       
       return distance;
       
    }
    
   // Is there a clear space to create the ball?
   public boolean entranceClear(int radius)
   {
        double distance = 0;
        
        for(int i = 0; i < ballBotArray.length; i++)
        {
            if(ballBotArray[i] != null)
            {
                //compare distance of ball to entrancePoint
                distance = distanceBetweenPoints(entrancePoint, ballBotArray[i].getPoint());
                
                //System.out.println("distance: "+ distance+ "   index:  "+i);
                
                if (distance < ballBotArray[i].getRadius() + radius) { 
                    return false;
                }
            }
        }
        
        return true;
   }
    
    
   //activity4: bounce off each other
   public BallBot ballBotToBounceOff(BallBot ballBot) 
   {
       TGPoint currentPoint = ballBot.getPoint();
       TGPoint nextPoint = ballBot.forwardPoint();
       double distance;
       int radius = ballBot.getRadius();
       
       for(int i = 0; i < ballBotArray.length; i++)
       {
            // valid ball:
            if (ballBotArray[i] != null) 
            {
                
                //is not the ball passed in:
                if (ballBotArray[i] != ballBot) 
                {
                    
                    TGPoint thisPoint = ballBotArray[i].getPoint();
                    distance = distanceBetweenPoints(currentPoint, thisPoint);
                    if (distance <= radius + ballBotArray[i].getRadius()) 
                    {
                        //check if next move will make then collide
                        if (distance > distanceBetweenPoints(nextPoint, thisPoint)) 
                        {
                            return ballBotArray[i];
                        }
                    }
                }
            }
       }   
       
       return null;
           
   }
   
   //public void runner()
   public static void main(String[] args)
   {
       
        int width = 700;   
        int height = 700;
        int arrayLength = 20; // number of balls
        int radius = 14;
        double startHeading = 0;
                
        // starting point coordinates
        double x = 0;
        double y = 0;
        
       
        BallWorld world = new BallWorld(width, height);
        TGPoint startPoint = new TGPoint(x, y);
        
        BallRunner runner = new BallRunner(world, startPoint, arrayLength);
        
        while (true) 
        {
            
            // is there room?
            int freeBallBotIndex = runner.findFreeBallBotIndex();
            if(freeBallBotIndex < arrayLength)
            {
                // check for clear entry:
                radius = (int)(Math.random() * 50) + 5;
                if (runner.entranceClear(radius)) {
                    
                    startHeading = Math.random() * 360;
                    
                    runner.ballBotArray[freeBallBotIndex] = new BallBot(world, runner.entrancePoint, startHeading, radius);
                    
                    //randomize radius, speed, color
                    int color = (int)(Math.random() * 31);
                    int pixelsPerSecMore = (int)(Math.random() * 100);
                    int pixelsPerSec = runner.ballBotArray[freeBallBotIndex].getPixelsPerSecond();
                    
                    runner.ballBotArray[freeBallBotIndex].setColor(color);
                    runner.ballBotArray[freeBallBotIndex].setPixelsPerSecond(pixelsPerSec + pixelsPerSecMore);

                    
                }
            }
            
            // move each ball
            for(int i = 0; i < runner.ballBotArray.length; i++)
            {
                // check if ball exists:
                if (runner.ballBotArray[i] != null) 
                {
                    if(runner.ballBotArray[i].canMoveForward(world) && (runner.ballBotToBounceOff(runner.ballBotArray[i]) == null))
                    {
                        
                        runner.ballBotArray[i].moveForward();
                   
                    }
                    else
                    {
                        runner.ballBotArray[i].setHeading((int)(Math.random() * 360));
                    }
                }
            }
        }
   }
   
   
   public void activity1(String[] args)
   //public void main(String[] args)
   {
       
        int width = 1000;
        int height = 1000;
        int radius = 40;
        double startHeading = Math.random() * 360;
        double x = 0;
        double y = 0;

        BallWorld world = new BallWorld(width, height);
        
        BallRunner runner = new BallRunner(world, entrancePoint, ballBotArray.length);
        
        TGPoint start = new TGPoint(x, y);
        
        int freeBallBotIndex = findFreeBallBotIndex();
   }
}


