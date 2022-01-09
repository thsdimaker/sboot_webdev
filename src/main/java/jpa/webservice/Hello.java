package jpa.webservice;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Hello {

    private String data;

    /**
    * Lombok 없으면 써야 하는 것들.. 매우 귀찮아짐.
    **/
//    public void setData(String data) {
//        this.data = data;
//    }
//
//    public String getData() {
//        return data;
//    }
}
