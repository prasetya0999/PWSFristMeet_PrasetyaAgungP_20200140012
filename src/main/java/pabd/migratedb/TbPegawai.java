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
@Table(name = "tb_pegawai")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbPegawai.findAll", query = "SELECT t FROM TbPegawai t"),
    @NamedQuery(name = "TbPegawai.findByIdPegawai", query = "SELECT t FROM TbPegawai t WHERE t.idPegawai = :idPegawai"),
    @NamedQuery(name = "TbPegawai.findByNamaPegawai", query = "SELECT t FROM TbPegawai t WHERE t.namaPegawai = :namaPegawai"),
    @NamedQuery(name = "TbPegawai.findByTlpPegawai", query = "SELECT t FROM TbPegawai t WHERE t.tlpPegawai = :tlpPegawai")})
public class TbPegawai implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_pegawai")
    private String idPegawai;
    @Basic(optional = false)
    @Column(name = "nama_pegawai")
    private String namaPegawai;
    @Basic(optional = false)
    @Column(name = "tlp_pegawai")
    private String tlpPegawai;

    public TbPegawai() {
    }

    public TbPegawai(String idPegawai) {
        this.idPegawai = idPegawai;
    }

    public TbPegawai(String idPegawai, String namaPegawai, String tlpPegawai) {
        this.idPegawai = idPegawai;
        this.namaPegawai = namaPegawai;
        this.tlpPegawai = tlpPegawai;
    }

    public String getIdPegawai() {
        return idPegawai;
    }

    public void setIdPegawai(String idPegawai) {
        this.idPegawai = idPegawai;
    }

    public String getNamaPegawai() {
        return namaPegawai;
    }

    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }

    public String getTlpPegawai() {
        return tlpPegawai;
    }

    public void setTlpPegawai(String tlpPegawai) {
        this.tlpPegawai = tlpPegawai;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPegawai != null ? idPegawai.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbPegawai)) {
            return false;
        }
        TbPegawai other = (TbPegawai) object;
        if ((this.idPegawai == null && other.idPegawai != null) || (this.idPegawai != null && !this.idPegawai.equals(other.idPegawai))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pabd.migratedb.TbPegawai[ idPegawai=" + idPegawai + " ]";
    }
    
}
