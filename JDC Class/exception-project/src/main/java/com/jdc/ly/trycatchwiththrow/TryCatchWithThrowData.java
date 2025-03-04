package com.jdc.ly.trycatchwiththrow;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.io.IOException;

public class TryCatchWithThrowData {

	public void useMessage() {
		try {
			String message = getData();
			if (message.length() == 0) {
				throw new NoSuchElementException("There is no message");
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
	}

	private String getData() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Type your message!!!!!!!!!");
		return br.readLine();
	}
}
