package vn.edu.uit.quanlychitieunhom.server_Java.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "thanhviennhom")
public class THANHVIENNHOM implements Serializable {
    @EmbeddedId
    private ThanhviennhomId id;

    public ThanhviennhomId getId() {
        return id;
    }

    public void setId(ThanhviennhomId id) {
        this.id = id;
    }
}
