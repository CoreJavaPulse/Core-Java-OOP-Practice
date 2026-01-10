package AreaWithCustomThread;
public class AreaMain {

	public static void main(String[] args) {
		Area areaObj = new Area();

		new AreaThread(areaObj,
				5.0f,    // radius
				4.0f,    // base
				6.0f,    // height
				8.0f,    // length
				3.0f);   // breadth
	}

}
