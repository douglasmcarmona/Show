import java.io.*;

class Player{
	int id;
	String Name;
	int[] questions, answers;
	void read() throws IOException {
        FileOutputStream out = null;
        try {
            out = new FileOutputStream("players.txt");
        } finally {
            if (out != null) {
                out.close();
            }
        }
	}
	void write() throws IOException {
        FileInputStream in = null;
        try {
        	in = new FileInputStream("players.txt");
        } finally {
            if (in != null) {
                in.close();
            }
        }
	}
}

class Question{
	int id, answers;
	String Questions, Answer1, Answer2, Answer3, Answer4;
	void read() throws IOException {
        FileOutputStream out = null;
        try {
            out = new FileOutputStream("questions.txt");
        } finally {
            if (out != null) {
                out.close();
            }
        }
	}
	void write() throws IOException {
        FileInputStream in = null;
        try {
        	in = new FileInputStream("questions.txt");
        } finally {
            if (in != null) {
                in.close();
            }
        }
	}
}

public class Show {
    public static void main(String[] args) throws IOException {
    	
    }
}
