package com.company.entity;

public class Post {
    private Integer id;
    private Integer user_id;
    private String title;
    private String body;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
/*"id":1407,"user_id":2868,"title":"Custodia cunae crebro censura annus tonsor.","body":"Umerus totidem admoveo. Cetera sufficio totus.
Eum despecto assumenda. Communis crustulum tondeo. Ipsum deficio claustrum. Temperantia ultio amplus. Aestas vilitas ambulo.
 Tersus utique depereo. Tenus bis temeritas. Delectus cinis textilis. Asper ut vespillo.
 Speciosus repudiandae corroboro. Aestus cumque voluptatem. Aut cernuus est. Cunabula deficio cilicium. Suus celo clementia."*/