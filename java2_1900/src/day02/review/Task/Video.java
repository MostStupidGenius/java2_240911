package day02.review.Task;

public class Video {
	
	public static void main(String[] args) {
		// 부모클래스인 Video로 자식클래스 객체들을
		// Video[]로 묶은 다음, 각각의 객체를 downcasting한 후
		// 각각의 객체 종류에 따라 다른 메시지를 남긴다.
		// Drama -> 드라마
		// Movie -> 영화
		// Animation-> 만화
		Video[] arrVideos = new Video[] {
			new Drama(),
			new Animation(),
			new Movie(),
			new Video()
		};
//		String className = String.valueOf(arrVideos[0].getClass());
//		System.out.println();
		
		for (Video video : arrVideos) {
//			String text = video instanceof Drama ? "": video instanceof Animation ? "" : video instanceof Movie ? "" : "";
			String text = "";
			if(video instanceof Drama) {
				text = "드라마";
			} else if(video instanceof Movie) {
				text = "영화";
			} else if(video instanceof Animation){
				text = "만화";
			} else {
				text = "비디오";
			}
			System.out.println(text);
		}
		
		
		
		
	}
}
