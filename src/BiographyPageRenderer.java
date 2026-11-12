public class BiographyPageRenderer implements PageRenderer {
    private final Student student;

    public BiographyPageRenderer(Student student) {
        this.student = student;
    }

    @Override
    public String render() {
        return "<!DOCTYPE html>\n"
                + "<html lang=\"tr\">\n"
                + "<head>\n"
                + "  <meta charset=\"UTF-8\">\n"
                + "  <title>" + student.getFullName() + "</title>\n"
                + "  <style>\n"
                + "    body { background-color: #f0f4f8; font-family: Verdana, sans-serif; margin: 40px; }\n"
                + "    h1 { color: #1a5276; font-family: 'Georgia', serif; }\n"
                + "    h2 { color: #c0392b; font-family: 'Courier New', monospace; }\n"
                + "    p { color: #2c3e50; font-size: 18px; line-height: 1.6; }\n"
                + "    .vurgu { color: #27ae60; font-weight: bold; }\n"
                + "    .not { color: #8e44ad; font-style: italic; }\n"
                + "  </style>\n"
                + "</head>\n"
                + "<body>\n"
                + "  <h1>" + student.getFullName() + "</h1>\n"
                + "  <h2>" + student.getStudentNo() + "</h2>\n"
                + "  <p>Merhaba! Ben <span class=\"vurgu\">" + student.getFullName() + "</span>. "
                + "İstanbul'da yaşıyorum ve Yazılım Mühendisliği alanında eğitim görüyorum.</p>\n"
                + "  <p>Yazılım geliştirme, ağ programlama ve yeni teknolojiler öğrenmek en büyük ilgi alanlarım arasında.</p>\n"
                + "  <p class=\"not\">Bu sayfa, hiçbir hazır web sunucusu kullanılmadan, sadece Java Socket sınıfları ile üretilmiştir.</p>\n"
                + "</body>\n"
                + "</html>";
    }
}