/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pabd.migratedb;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "tb_transaksi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbTransaksi.findAll", query = "SELECT t FROM TbTransaksi t"),
    @NamedQuery(name = "TbTransaksi.findByIdTansk", query = "SELECT t FROM TbTransaksi t WHERE t.idTansk = :idTansk"),
    @NamedQuery(name = "TbTransaksi.findByJmlhBeli", query = "SELECT t FROM TbTransaksi t WHERE t.jmlhBeli = :jmlhBeli"),
    @NamedQuery(name = "TbTransaksi.findByTotal", query = "SELECT t FROM TbTransaksi t WHERE t.total = :total"),
    @NamedQuery(name = "TbTransaksi.findByWaktu", query = "SELECT t FROM TbTransaksi t WHERE t.waktu = :waktu")})
public class TbTransaksi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_tansk")
    private String idTansk;
    @Basic(optional = false)
    @Column(name = "jmlh_beli")
    private int jmlhBeli;
    @Basic(optional = false)
    @Column(name = "total")
    private int total;
    @Basic(optional = false)
    @Column(name = "waktu")
    @Temporal(TemporalType.DATE)
    private Date waktu;

    public TbTransaksi() {
    }

    public TbTransaksi(String idTansk) {
        this.idTansk = idTansk;
    }

    public TbTransaksi(String idTansk, int jmlhBeli, int total, Date waktu) {
        this.idTansk = idTansk;
        this.jmlhBeli = jmlhBeli;
        this.total = total;
        this.waktu = waktu;
    }

    public String getIdTansk() {
        return idTansk;
    }

    public void setIdTansk(String idTansk) {
        this.idTansk = idTansk;
    }

    public int getJmlhBeli() {
        return jmlhBeli;
    }

    public void setJmlhBeli(int jmlhBeli) {
        this.jmlhBeli = jmlhBeli;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Date getWaktu() {
        return waktu;
    }

    public void setWaktu(Date waktu) {
        this.waktu = waktu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTansk != null ? idTansk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbTransaksi)) {
            return false;
        }
        TbTransaksi other = (TbTransaksi) object;
        if ((this.idTansk == null && other.idTansk != null) || (this.idTansk != null && !this.idTansk.equals(other.idTansk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pabd.migratedb.TbTransaksi[ idTansk=" + idTansk + " ]";
    }
    
}
