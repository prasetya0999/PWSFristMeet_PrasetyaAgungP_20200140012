/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pabd.migratedb;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "tb_suplier")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbSuplier.findAll", query = "SELECT t FROM TbSuplier t"),
    @NamedQuery(name = "TbSuplier.findByIdSuplier", query = "SELECT t FROM TbSuplier t WHERE t.idSuplier = :idSuplier"),
    @NamedQuery(name = "TbSuplier.findByNamaSuplier", query = "SELECT t FROM TbSuplier t WHERE t.namaSuplier = :namaSuplier"),
    @NamedQuery(name = "TbSuplier.findByTlpSuplier", query = "SELECT t FROM TbSuplier t WHERE t.tlpSuplier = :tlpSuplier"),
    @NamedQuery(name = "TbSuplier.findByAlamtSuplier", query = "SELECT t FROM TbSuplier t WHERE t.alamtSuplier = :alamtSuplier")})
public class TbSuplier implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_suplier")
    private String idSuplier;
    @Basic(optional = false)
    @Column(name = "nama_suplier")
    private String namaSuplier;
    @Basic(optional = false)
    @Column(name = "tlp_suplier")
    private String tlpSuplier;
    @Basic(optional = false)
    @Column(name = "alamt_suplier")
    private String alamtSuplier;

    public TbSuplier() {
    }

    public TbSuplier(String idSuplier) {
        this.idSuplier = idSuplier;
    }

    public TbSuplier(String idSuplier, String namaSuplier, String tlpSuplier, String alamtSuplier) {
        this.idSuplier = idSuplier;
        this.namaSuplier = namaSuplier;
        this.tlpSuplier = tlpSuplier;
        this.alamtSuplier = alamtSuplier;
    }

    public String getIdSuplier() {
        return idSuplier;
    }

    public void setIdSuplier(String idSuplier) {
        this.idSuplier = idSuplier;
    }

    public String getNamaSuplier() {
        return namaSuplier;
    }

    public void setNamaSuplier(String namaSuplier) {
        this.namaSuplier = namaSuplier;
    }

    public String getTlpSuplier() {
        return tlpSuplier;
    }

    public void setTlpSuplier(String tlpSuplier) {
        this.tlpSuplier = tlpSuplier;
    }

    public String getAlamtSuplier() {
        return alamtSuplier;
    }

    public void setAlamtSuplier(String alamtSuplier) {
        this.alamtSuplier = alamtSuplier;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSuplier != null ? idSuplier.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbSuplier)) {
            return false;
        }
        TbSuplier other = (TbSuplier) object;
        if ((this.idSuplier == null && other.idSuplier != null) || (this.idSuplier != null && !this.idSuplier.equals(other.idSuplier))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pabd.migratedb.TbSuplier[ idSuplier=" + idSuplier + " ]";
    }
    
}
