public class Main {
    public static void main(String[] args) throws Exception {
        Student student = new Student("Ad Soyad", "123456789"); // <-- KENDİ BİLGİLERİNİ YAZ
        PageRenderer renderer = new BiographyPageRenderer(student);
        HttpResponseBuilder builder = new HttpResponseBuilder();

        new WebServer(1989, renderer, builder).start();
    }
}