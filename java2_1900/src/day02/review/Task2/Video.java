package day02.review.Task2;

public abstract class Video {
	
	abstract void broadcasting();
	
	public static void main(String[] args) {
		Video[] arrVideos = new Video[] {
			new Drama(),
			new Movie(),
			new Animation(),
		};
		
		for (Video video : arrVideos) {
			video.broadcasting();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
