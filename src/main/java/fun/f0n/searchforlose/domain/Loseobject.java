package fun.f0n.searchforlose.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName loseobject
 */
@TableName(value ="loseobject")
@Data
public class Loseobject implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private String title;

    /**
     * 
     */
    private String picurl;

    /**
     * 
     */
    private Date finddate;

    /**
     * 
     */
    private String location;

    /**
     * 
     */
    private String type;

    /**
     * 
     */
    private String remarktable;

    /**
     * 
     */
    private Integer finish;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Loseobject other = (Loseobject) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getPicurl() == null ? other.getPicurl() == null : this.getPicurl().equals(other.getPicurl()))
            && (this.getFinddate() == null ? other.getFinddate() == null : this.getFinddate().equals(other.getFinddate()))
            && (this.getLocation() == null ? other.getLocation() == null : this.getLocation().equals(other.getLocation()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getRemarktable() == null ? other.getRemarktable() == null : this.getRemarktable().equals(other.getRemarktable()))
            && (this.getFinish() == null ? other.getFinish() == null : this.getFinish().equals(other.getFinish()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getPicurl() == null) ? 0 : getPicurl().hashCode());
        result = prime * result + ((getFinddate() == null) ? 0 : getFinddate().hashCode());
        result = prime * result + ((getLocation() == null) ? 0 : getLocation().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getRemarktable() == null) ? 0 : getRemarktable().hashCode());
        result = prime * result + ((getFinish() == null) ? 0 : getFinish().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", picurl=").append(picurl);
        sb.append(", finddate=").append(finddate);
        sb.append(", location=").append(location);
        sb.append(", type=").append(type);
        sb.append(", remarktable=").append(remarktable);
        sb.append(", finish=").append(finish);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}