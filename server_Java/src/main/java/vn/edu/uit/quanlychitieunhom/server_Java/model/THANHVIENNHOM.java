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
    @GeneratedValue
    private ThanhviennhomId id;
}
