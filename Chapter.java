import java.lang.Math;
import java.util.*;

public class Chapter {
public static String nearestChapter(BookChapter[] arr, int page) {
	int min = Math.abs(arr[0].page - page);
	int index = 0;
	for(int i = 1; i < arr.length; i++) {
		if(Math.abs(arr[i].page - page) < min) {
			min = Math.abs(arr[i].page - page);
			index = i;
		}
	}
	return arr[index].chapName;
}
}
