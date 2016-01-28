package db;

/**
 * Created by lb on 2016/1/26.
 */
public class bean {


    /**
     * who : Andrew Liu
     * publishedAt : 2016-01-25T06:59:08.994Z
     * desc : iOS内存管理和malloc源码解读
     * type : iOS
     * url : http://yq.aliyun.com/articles/3065?hmsr=toutiao.io&spm=5176.100239.yqblog1.16.B2rcAI&utm_medium=toutiao.io&utm_source=toutiao.io
     * used : true
     * objectId : 56a46ce0c1406100525c5109
     * createdAt : 2016-01-24T06:19:12.942Z
     * updatedAt : 2016-01-25T06:59:09.870Z
     */

    private String who;
    private String publishedAt;
    private String desc;
    private String type;
    private String url;
    private boolean used;
    private String objectId;
    private String createdAt;
    private String updatedAt;

    public void setWho(String who) {
        this.who = who;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getWho() {
        return who;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public String getDesc() {
        return desc;
    }

    public String getType() {
        return type;
    }

    public String getUrl() {
        return url;
    }

    public boolean isUsed() {
        return used;
    }

    public String getObjectId() {
        return objectId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
}
