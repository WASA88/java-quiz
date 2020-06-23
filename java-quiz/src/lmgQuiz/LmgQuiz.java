package lmgQuiz;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class LmgQuiz {
	public static void main(String[] args) {
		System.out.println("1. หาผลบวกของตัวเลขทั้งหมดใน string ต่อไปนี้");
		String q1 = "1234";
		String q2 = "42281";
		String q3 = "42";

		System.out.println("\""+q1+"\""+" = "+findSumOfString(q1));
		System.out.println("\""+q2+"\""+" = "+findSumOfString(q2));
		System.out.println("\""+q3+"\""+" = "+findSumOfString(q3));
		System.out.println();
		
		System.out.println("2. หาตัวเลขที่ไม่ซ้ำกันใน array ต่อไปนี้");
		int a1[] = {1,2,1,2,3,4};
		int a2[] = {1,2};
		int a3[] = {1,3,4,1};
		System.out.println("[1,2,1,2,3,4] = " +removeDuplicatetValue(a1));
		System.out.println("[1,2] = " +removeDuplicatetValue(a2));
		System.out.println("[1,3,4,1] = " +removeDuplicatetValue(a3));
		System.out.println();
		
		System.out.println("3. เช็คว่า string เมื่อย้อนอ่านแล้วได้ string ตัวเดิมไหม");
		String str1 = "dad";
		String str2 = "hello";
		String str3 = "level";
		String str4 = "thai";
		System.out.println("\""+str1+"\""+" = "+isPalindrome(str1));
		System.out.println("\""+str2+"\""+" = "+isPalindrome(str2));
		System.out.println("\""+str3+"\""+" = "+isPalindrome(str3));
		System.out.println("\""+str4+"\""+" = "+isPalindrome(str4));
		System.out.println();
		
		/*
		 * - เขียน SQL ให้แสดงผล first_name, last_name และ department_name
		 * select e.first_name, e.last_name, d.department_id from employee e 
		 * left join department d on e.department_id = d.id
		 * - เขียน SQL ให้แสดงผล phone_number ของ employee ที่ชื่อ john
		 * select p.phone_number from employee e right join phone p on e.id = p.id 
		 * where e.first_name = 'John'
		 */
		
		System.out.println("5. มี Array ขนาด n ใน array จะไม่มีเลขซ้ำกัน");
		System.out.println("ให้หาผลบวกของเลขที่มากที่สุด  n-1 จำนวน");
		int[] arr1 = {1,3,5,7};
		int[] arr2 = {4,1,3,8,2};
		System.out.println(Arrays.toString(arr1) + " = "+ sumOfNumber(arr1));
		System.out.println(Arrays.toString(arr2) + " = "+ sumOfNumber(arr2));
	}
	
	public static int findSumOfString(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum += Character.getNumericValue(str.charAt(i));
		}
		
		return sum;
	}
	
	public static Set<Integer> removeDuplicatetValue(int values[]) {

		Set<Integer> set = new HashSet<>();
		
		for (int i = 0; i < values.length; i++) {
			set.add(values[i]);
		}
		return set;
	}
	
	public static String isPalindrome(String str) {
		String normalStr = str;
		String reverseStr = "";
		
		for (int i = str.length()-1; i >= 0; i--) {
			char c = str.charAt(i);
			reverseStr += c;
		}
		
		return normalStr.equalsIgnoreCase(reverseStr)? "Yes" : "No";
	}
	
	public static int sumOfNumber(int[] arr) {
		int result = 0;
		Arrays.sort(arr);
		
		for (int i = arr.length-1; i >= 1; i--) {
			result += arr[i];
		}
		return result;
	}
}

