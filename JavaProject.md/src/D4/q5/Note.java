package D4.q5;

public class Note {
    private String title;
    private String[] pages;

    public Note(String title, int pages) {
        this.title = title;
        this.pages = new String[pages];
    }

    public void write(int page, String content) {
        pages[page] = content;
    }

    public String read(int page) {
        return pages[page];
    }

    public int wrotePages() {
        int count = 0;
        for (String page : pages) {
            if (page != null) count++;
        }
        return count;
    }

    public void readAll() {
        for (String page : pages) {
            if (page != null) System.out.println(page);
        }
    }

    public String getTitle() {
        return title;
    }
}
//Note 클래스를 만들어보자.
//
//Note는 제목과 페이지를 각각 문자열과 문자열 배열로 가지고 있다.
//Note의 생성자는 제목과 페이지 수를 인자로 받는다.
//페이지의 길이는 전달받은 페이지 수와 동일하다.
//Note는 글을 작성할 수 있는 write 메서드와 글을 읽을 수 있는 read 메서드를 가지고 있다.
//write 메서드는 작성할 쪽과 작성할 내용을 인자로 받는다. 이때 본래 적혀있던 내용이 있다면 지워진다.
//read 메서드는 읽을 쪽을 인자로 받는다. 작성된 내용을 반환한다. (작성된 내용이 없다면 null이 반환될 것이다.)
//총 몇쪽이 작성되었는지를 반환하는 메서드를 가지고 있다.
//작성된 모든 내용을 페이지 순서대로 출력하는 메서드를 가지고 있다. 작성되지 않은 페이지는 출력하지 않는다.