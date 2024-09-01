package Phonebook;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class InputOutput {
	public void writeFile(String file, SLList list) {
		ObjectOutputStream o = null;
		try {
			o = new ObjectOutputStream(new FileOutputStream(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			o.writeObject(list);
			System.out.println("We have created a File!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			o.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public SLList readFile(String file) {
		ObjectInputStream i = null;
		SLList temp = null;

		try {
			i = new ObjectInputStream(new FileInputStream(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			temp = (SLList) i.readObject();
			System.out.println("Successfully restored data from file!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {	
			e.printStackTrace();
		}
		try {
			i.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return temp;
	}
}