/*
    Lecture note example - Random!!
*/

class LectureRandom{
    public static void main(String args[]) {
        System.out.println(Math.random()*5);
        System.out.println(Math.random()*5+15);
        System.out.println(Math.random()*(6767-1014)+1024);
        //int(-13,42)
        System.out.println((int)(Math.random()*(42-(-13)+(-13))));
        //int((30,55),(80,105))
        int low = (int)(Math.random()*(55-30)+30);
        int high = (int)(Math.random()*(105-80)+80);
        int answer = (int)(Math.random()*(high-low)+low);
        
        System.out.println(answer);
	}
}
