/*
 You are getting ready for an OOP exam; each day during the daytime
you study c chapters. However, each night during the sleep you forget f of these chapters and need
to study them again next day (c > f ). You will stop once you cover all the t chapters from the
book (c < t). On the last day of studying it is possible to cover less than c chapters.
Write two versions of a program that uses a Scanner to read the values of c, f and t and outputs
the number of days needed to get ready for the exam.
The first version should simulate the process while the second one should accomplish the task
without any loops.
 */

import java.util.*;
import java.lang.Math;

public class Problem2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i=0;
		System.out.println("Enter The Total Lessons we should cover:");
		int t=s.nextInt();
		System.out.println("Lessons per night:");
		int c=s.nextInt();
		System.out.println("Lessons might be forgotten every day:");
		int f=s.nextInt();
		int readLessons=0;
		while (readLessons<t)
		{
			readLessons=(c-f)*i;
			
			i++;
		}
		System.out.println("during "+(i-1)+" days I can cover all lessons.");
		System.out.println("Second method \t"+(int)Math.ceil((double)t/(c-f))); //Math Formula
//without ceiling in some cases we get wrong number
	}

}
