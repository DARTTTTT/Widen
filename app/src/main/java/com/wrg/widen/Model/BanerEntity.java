package com.wrg.widen.Model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by 翁 on 2017/8/28.
 */

public class BanerEntity implements Serializable {


    /**
     * issueList : [{"releaseTime":1503882000000,"type":"morning","date":1503882000000,"publishTime":1503882000000,"itemList":[{"type":"video","data":{"dataType":"VideoBeanForClient","id":17630,"title":"大卫·芬奇经典影片集锦","slogan":"致敬电影大师，生日快乐！","description":"今天是著名美国导演大卫·芬奇的生日，「七宗罪」、「搏击俱乐部」、「返老还童」等经典电影皆出自他手。这条短片集合了他的所有电影。唯一没有被录入的是「异形 3」，这虽然是大卫的第一部电影，但由于他本人其实并不喜欢这部影片，怀着这样的心情，作者便把它从集锦中除去了。From Gabriel Fasano","provider":{"name":"Vimeo","alias":"vimeo","icon":"http://img.kaiyanapp.com/c3ad630be461cbb081649c9e21d6cbe3.png"},"category":"集锦","author":null,"cover":{"feed":"http://img.kaiyanapp.com/db2a2a46a9774f9e058dc7e1dfdd0bc0.jpeg?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/db2a2a46a9774f9e058dc7e1dfdd0bc0.jpeg?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/b6ff175449cc8d6251e926f98ba78069.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":"http://img.kaiyanapp.com/db2a2a46a9774f9e058dc7e1dfdd0bc0.jpeg?imageView2/1/w/720/h/560/format/jpg/q/75|watermark/1/image/aHR0cDovL2ltZy5rYWl5YW5hcHAuY29tL2JsYWNrXzMwLnBuZw==/dissolve/100/gravity/Center/dx/0/dy/0|imageslim"},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=17630&editionType=default&source=qcloud","thumbPlayUrl":null,"duration":395,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=17630","forWeibo":"http://wandou.im/3mg1rz"},"releaseTime":1503882002000,"library":"DAILY","playInfo":[{"height":480,"width":854,"urlList":[{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=17630&editionType=normal&source=qcloud","size":23282341},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=17630&editionType=normal&source=ucloud","size":23282341}],"name":"标清","type":"normal","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=17630&editionType=normal&source=qcloud"},{"height":720,"width":1280,"urlList":[{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=17630&editionType=high&source=qcloud","size":38985775},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=17630&editionType=high&source=ucloud","size":38985775}],"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=17630&editionType=high&source=qcloud"}],"consumption":{"collectionCount":213,"shareCount":64,"replyCount":3},"campaign":null,"waterMarks":null,"adTrack":null,"tags":[{"id":36,"name":"集锦","actionUrl":"eyepetizer://tag/36/?title=%E9%9B%86%E9%94%A6","adTrack":null},{"id":570,"name":"电影相关","actionUrl":"eyepetizer://tag/570/?title=%E7%94%B5%E5%BD%B1%E7%9B%B8%E5%85%B3","adTrack":null},{"id":496,"name":"致敬","actionUrl":"eyepetizer://tag/496/?title=%E8%87%B4%E6%95%AC","adTrack":null},{"id":34,"name":"混剪","actionUrl":"eyepetizer://tag/34/?title=%E6%B7%B7%E5%89%AA","adTrack":null}],"type":"NORMAL","titlePgc":null,"descriptionPgc":null,"remark":"One of the best directors of the last 20 years. David Fincher mixes perfection in the execution of a film with intriguing plots, great dialogue, fantástic soundtrack and excellent perfomances. His films are smart and suspenseful, with attention in every detail. This are his films. Enjoy! Clarification: Although Alien3 was his first film, I didn't include it because David himself hates it. The producers didn't let him do the movie he wanted and there´s little of his talent in that movie. So, for respect to Fincher, I didn't include it.","idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1503882000000,"promotion":null,"label":null,"labelList":[],"descriptionEditor":"今天是著名美国导演大卫·芬奇的生日，「七宗罪」、「搏击俱乐部」、「返老还童」等经典电影皆出自他手。这条短片集合了他的所有电影。唯一没有被录入的是「异形 3」，这虽然是大卫的第一部电影，但由于他本人其实并不喜欢这部影片，怀着这样的心情，作者便把它从集锦中除去了。From Gabriel Fasano","collected":false,"played":false,"subtitles":[],"lastViewTime":null,"playlists":null},"tag":null}],"count":7}]
     * nextPageUrl : http://baobab.kaiyanapp.com/api/v2/feed?date=1503795600000&num=1
     * nextPublishTime : 1503968400000
     * newestIssueType : morning
     * dialog : null
     */

    private String nextPageUrl;
    private long nextPublishTime;
    private String newestIssueType;
    private Object dialog;
    private List<IssueListBean> issueList;

    @Override
    public String toString() {
        return "BanerEntity{" +
                "nextPageUrl='" + nextPageUrl + '\'' +
                ", nextPublishTime=" + nextPublishTime +
                ", newestIssueType='" + newestIssueType + '\'' +
                ", dialog=" + dialog +
                ", issueList=" + issueList +
                '}';
    }

    public String getNextPageUrl() {
        return nextPageUrl;
    }

    public void setNextPageUrl(String nextPageUrl) {
        this.nextPageUrl = nextPageUrl;
    }

    public long getNextPublishTime() {
        return nextPublishTime;
    }

    public void setNextPublishTime(long nextPublishTime) {
        this.nextPublishTime = nextPublishTime;
    }

    public String getNewestIssueType() {
        return newestIssueType;
    }

    public void setNewestIssueType(String newestIssueType) {
        this.newestIssueType = newestIssueType;
    }

    public Object getDialog() {
        return dialog;
    }

    public void setDialog(Object dialog) {
        this.dialog = dialog;
    }

    public List<IssueListBean> getIssueList() {
        return issueList;
    }

    public void setIssueList(List<IssueListBean> issueList) {
        this.issueList = issueList;
    }

    public static class IssueListBean implements Serializable{
        /**
         * releaseTime : 1503882000000
         * type : morning
         * date : 1503882000000
         * publishTime : 1503882000000
         * itemList : [{"type":"video","data":{"dataType":"VideoBeanForClient","id":17630,"title":"大卫·芬奇经典影片集锦","slogan":"致敬电影大师，生日快乐！","description":"今天是著名美国导演大卫·芬奇的生日，「七宗罪」、「搏击俱乐部」、「返老还童」等经典电影皆出自他手。这条短片集合了他的所有电影。唯一没有被录入的是「异形 3」，这虽然是大卫的第一部电影，但由于他本人其实并不喜欢这部影片，怀着这样的心情，作者便把它从集锦中除去了。From Gabriel Fasano","provider":{"name":"Vimeo","alias":"vimeo","icon":"http://img.kaiyanapp.com/c3ad630be461cbb081649c9e21d6cbe3.png"},"category":"集锦","author":null,"cover":{"feed":"http://img.kaiyanapp.com/db2a2a46a9774f9e058dc7e1dfdd0bc0.jpeg?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/db2a2a46a9774f9e058dc7e1dfdd0bc0.jpeg?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/b6ff175449cc8d6251e926f98ba78069.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":"http://img.kaiyanapp.com/db2a2a46a9774f9e058dc7e1dfdd0bc0.jpeg?imageView2/1/w/720/h/560/format/jpg/q/75|watermark/1/image/aHR0cDovL2ltZy5rYWl5YW5hcHAuY29tL2JsYWNrXzMwLnBuZw==/dissolve/100/gravity/Center/dx/0/dy/0|imageslim"},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=17630&editionType=default&source=qcloud","thumbPlayUrl":null,"duration":395,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=17630","forWeibo":"http://wandou.im/3mg1rz"},"releaseTime":1503882002000,"library":"DAILY","playInfo":[{"height":480,"width":854,"urlList":[{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=17630&editionType=normal&source=qcloud","size":23282341},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=17630&editionType=normal&source=ucloud","size":23282341}],"name":"标清","type":"normal","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=17630&editionType=normal&source=qcloud"},{"height":720,"width":1280,"urlList":[{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=17630&editionType=high&source=qcloud","size":38985775},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=17630&editionType=high&source=ucloud","size":38985775}],"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=17630&editionType=high&source=qcloud"}],"consumption":{"collectionCount":213,"shareCount":64,"replyCount":3},"campaign":null,"waterMarks":null,"adTrack":null,"tags":[{"id":36,"name":"集锦","actionUrl":"eyepetizer://tag/36/?title=%E9%9B%86%E9%94%A6","adTrack":null},{"id":570,"name":"电影相关","actionUrl":"eyepetizer://tag/570/?title=%E7%94%B5%E5%BD%B1%E7%9B%B8%E5%85%B3","adTrack":null},{"id":496,"name":"致敬","actionUrl":"eyepetizer://tag/496/?title=%E8%87%B4%E6%95%AC","adTrack":null},{"id":34,"name":"混剪","actionUrl":"eyepetizer://tag/34/?title=%E6%B7%B7%E5%89%AA","adTrack":null}],"type":"NORMAL","titlePgc":null,"descriptionPgc":null,"remark":"One of the best directors of the last 20 years. David Fincher mixes perfection in the execution of a film with intriguing plots, great dialogue, fantástic soundtrack and excellent perfomances. His films are smart and suspenseful, with attention in every detail. This are his films. Enjoy! Clarification: Although Alien3 was his first film, I didn't include it because David himself hates it. The producers didn't let him do the movie he wanted and there´s little of his talent in that movie. So, for respect to Fincher, I didn't include it.","idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1503882000000,"promotion":null,"label":null,"labelList":[],"descriptionEditor":"今天是著名美国导演大卫·芬奇的生日，「七宗罪」、「搏击俱乐部」、「返老还童」等经典电影皆出自他手。这条短片集合了他的所有电影。唯一没有被录入的是「异形 3」，这虽然是大卫的第一部电影，但由于他本人其实并不喜欢这部影片，怀着这样的心情，作者便把它从集锦中除去了。From Gabriel Fasano","collected":false,"played":false,"subtitles":[],"lastViewTime":null,"playlists":null},"tag":null}]
         * count : 7
         */

        private long releaseTime;
        private String type;
        private long date;
        private long publishTime;
        private int count;
        private List<ItemListBean> itemList;

        public long getReleaseTime() {
            return releaseTime;
        }

        public void setReleaseTime(long releaseTime) {
            this.releaseTime = releaseTime;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public long getDate() {
            return date;
        }

        public void setDate(long date) {
            this.date = date;
        }

        public long getPublishTime() {
            return publishTime;
        }

        public void setPublishTime(long publishTime) {
            this.publishTime = publishTime;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public List<ItemListBean> getItemList() {
            return itemList;
        }

        public void setItemList(List<ItemListBean> itemList) {
            this.itemList = itemList;
        }

        @Override
        public String toString() {
            return "IssueListBean{" +
                    "releaseTime=" + releaseTime +
                    ", type='" + type + '\'' +
                    ", date=" + date +
                    ", publishTime=" + publishTime +
                    ", count=" + count +
                    ", itemList=" + itemList +
                    '}';
        }

        public static class ItemListBean implements Serializable{
            /**
             * type : video
             * data : {"dataType":"VideoBeanForClient","id":17630,"title":"大卫·芬奇经典影片集锦","slogan":"致敬电影大师，生日快乐！","description":"今天是著名美国导演大卫·芬奇的生日，「七宗罪」、「搏击俱乐部」、「返老还童」等经典电影皆出自他手。这条短片集合了他的所有电影。唯一没有被录入的是「异形 3」，这虽然是大卫的第一部电影，但由于他本人其实并不喜欢这部影片，怀着这样的心情，作者便把它从集锦中除去了。From Gabriel Fasano","provider":{"name":"Vimeo","alias":"vimeo","icon":"http://img.kaiyanapp.com/c3ad630be461cbb081649c9e21d6cbe3.png"},"category":"集锦","author":null,"cover":{"feed":"http://img.kaiyanapp.com/db2a2a46a9774f9e058dc7e1dfdd0bc0.jpeg?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/db2a2a46a9774f9e058dc7e1dfdd0bc0.jpeg?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/b6ff175449cc8d6251e926f98ba78069.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":"http://img.kaiyanapp.com/db2a2a46a9774f9e058dc7e1dfdd0bc0.jpeg?imageView2/1/w/720/h/560/format/jpg/q/75|watermark/1/image/aHR0cDovL2ltZy5rYWl5YW5hcHAuY29tL2JsYWNrXzMwLnBuZw==/dissolve/100/gravity/Center/dx/0/dy/0|imageslim"},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=17630&editionType=default&source=qcloud","thumbPlayUrl":null,"duration":395,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=17630","forWeibo":"http://wandou.im/3mg1rz"},"releaseTime":1503882002000,"library":"DAILY","playInfo":[{"height":480,"width":854,"urlList":[{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=17630&editionType=normal&source=qcloud","size":23282341},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=17630&editionType=normal&source=ucloud","size":23282341}],"name":"标清","type":"normal","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=17630&editionType=normal&source=qcloud"},{"height":720,"width":1280,"urlList":[{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=17630&editionType=high&source=qcloud","size":38985775},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=17630&editionType=high&source=ucloud","size":38985775}],"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=17630&editionType=high&source=qcloud"}],"consumption":{"collectionCount":213,"shareCount":64,"replyCount":3},"campaign":null,"waterMarks":null,"adTrack":null,"tags":[{"id":36,"name":"集锦","actionUrl":"eyepetizer://tag/36/?title=%E9%9B%86%E9%94%A6","adTrack":null},{"id":570,"name":"电影相关","actionUrl":"eyepetizer://tag/570/?title=%E7%94%B5%E5%BD%B1%E7%9B%B8%E5%85%B3","adTrack":null},{"id":496,"name":"致敬","actionUrl":"eyepetizer://tag/496/?title=%E8%87%B4%E6%95%AC","adTrack":null},{"id":34,"name":"混剪","actionUrl":"eyepetizer://tag/34/?title=%E6%B7%B7%E5%89%AA","adTrack":null}],"type":"NORMAL","titlePgc":null,"descriptionPgc":null,"remark":"One of the best directors of the last 20 years. David Fincher mixes perfection in the execution of a film with intriguing plots, great dialogue, fantástic soundtrack and excellent perfomances. His films are smart and suspenseful, with attention in every detail. This are his films. Enjoy! Clarification: Although Alien3 was his first film, I didn't include it because David himself hates it. The producers didn't let him do the movie he wanted and there´s little of his talent in that movie. So, for respect to Fincher, I didn't include it.","idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1503882000000,"promotion":null,"label":null,"labelList":[],"descriptionEditor":"今天是著名美国导演大卫·芬奇的生日，「七宗罪」、「搏击俱乐部」、「返老还童」等经典电影皆出自他手。这条短片集合了他的所有电影。唯一没有被录入的是「异形 3」，这虽然是大卫的第一部电影，但由于他本人其实并不喜欢这部影片，怀着这样的心情，作者便把它从集锦中除去了。From Gabriel Fasano","collected":false,"played":false,"subtitles":[],"lastViewTime":null,"playlists":null}
             * tag : null
             */

            private String type;
            private DataBean data;
            private Object tag;

            @Override
            public String toString() {
                return "ItemListBean{" +
                        "type='" + type + '\'' +
                        ", data=" + data +
                        ", tag=" + tag +
                        '}';
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public DataBean getData() {
                return data;
            }

            public void setData(DataBean data) {
                this.data = data;
            }

            public Object getTag() {
                return tag;
            }

            public void setTag(Object tag) {
                this.tag = tag;
            }

            public static class DataBean implements Serializable{

                @Override
                public String toString() {
                    return "DataBean{" +
                            "dataType='" + dataType + '\'' +
                            ", id=" + id +
                            ", title='" + title + '\'' +
                            ", slogan='" + slogan + '\'' +
                            ", description='" + description + '\'' +
                            ", image='" + image + '\'' +
                            ", actionUrl='" + actionUrl + '\'' +
                            ", shade=" + shade +
                            ", provider=" + provider +
                            ", category='" + category + '\'' +
                            ", author=" + author +
                            ", cover=" + cover +
                            ", playUrl='" + playUrl + '\'' +
                            ", thumbPlayUrl=" + thumbPlayUrl +
                            ", duration=" + duration +
                            ", webUrl=" + webUrl +
                            ", releaseTime=" + releaseTime +
                            ", library='" + library + '\'' +
                            ", consumption=" + consumption +
                            ", campaign=" + campaign +
                            ", waterMarks=" + waterMarks +
                            ", adTrack=" + adTrack +
                            ", type='" + type + '\'' +
                            ", titlePgc=" + titlePgc +
                            ", descriptionPgc=" + descriptionPgc +
                            ", remark='" + remark + '\'' +
                            ", idx=" + idx +
                            ", shareAdTrack=" + shareAdTrack +
                            ", favoriteAdTrack=" + favoriteAdTrack +
                            ", webAdTrack=" + webAdTrack +
                            ", date=" + date +
                            ", promotion=" + promotion +
                            ", label=" + label +
                            ", descriptionEditor='" + descriptionEditor + '\'' +
                            ", collected=" + collected +
                            ", played=" + played +
                            ", lastViewTime=" + lastViewTime +
                            ", playlists=" + playlists +
                            ", playInfo=" + playInfo +
                            ", tags=" + tags +
                            ", labelList=" + labelList +
                            ", subtitles=" + subtitles +
                            '}';
                }

                /**
                 * dataType : VideoBeanForClient
                 * id : 17630
                 * title : 大卫·芬奇经典影片集锦
                 * slogan : 致敬电影大师，生日快乐！
                 * description : 今天是著名美国导演大卫·芬奇的生日，「七宗罪」、「搏击俱乐部」、「返老还童」等经典电影皆出自他手。这条短片集合了他的所有电影。唯一没有被录入的是「异形 3」，这虽然是大卫的第一部电影，但由于他本人其实并不喜欢这部影片，怀着这样的心情，作者便把它从集锦中除去了。From Gabriel Fasano
                 * provider : {"name":"Vimeo","alias":"vimeo","icon":"http://img.kaiyanapp.com/c3ad630be461cbb081649c9e21d6cbe3.png"}
                 * category : 集锦
                 * author : null
                 * cover : {"feed":"http://img.kaiyanapp.com/db2a2a46a9774f9e058dc7e1dfdd0bc0.jpeg?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/db2a2a46a9774f9e058dc7e1dfdd0bc0.jpeg?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/b6ff175449cc8d6251e926f98ba78069.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":"http://img.kaiyanapp.com/db2a2a46a9774f9e058dc7e1dfdd0bc0.jpeg?imageView2/1/w/720/h/560/format/jpg/q/75|watermark/1/image/aHR0cDovL2ltZy5rYWl5YW5hcHAuY29tL2JsYWNrXzMwLnBuZw==/dissolve/100/gravity/Center/dx/0/dy/0|imageslim"}
                 * playUrl : http://baobab.kaiyanapp.com/api/v1/playUrl?vid=17630&editionType=default&source=qcloud
                 * thumbPlayUrl : null
                 * duration : 395
                 * webUrl : {"raw":"http://www.eyepetizer.net/detail.html?vid=17630","forWeibo":"http://wandou.im/3mg1rz"}
                 * releaseTime : 1503882002000
                 * library : DAILY
                 * playInfo : [{"height":480,"width":854,"urlList":[{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=17630&editionType=normal&source=qcloud","size":23282341},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=17630&editionType=normal&source=ucloud","size":23282341}],"name":"标清","type":"normal","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=17630&editionType=normal&source=qcloud"},{"height":720,"width":1280,"urlList":[{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=17630&editionType=high&source=qcloud","size":38985775},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=17630&editionType=high&source=ucloud","size":38985775}],"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=17630&editionType=high&source=qcloud"}]
                 * consumption : {"collectionCount":213,"shareCount":64,"replyCount":3}
                 * campaign : null
                 * waterMarks : null
                 * adTrack : null
                 * tags : [{"id":36,"name":"集锦","actionUrl":"eyepetizer://tag/36/?title=%E9%9B%86%E9%94%A6","adTrack":null},{"id":570,"name":"电影相关","actionUrl":"eyepetizer://tag/570/?title=%E7%94%B5%E5%BD%B1%E7%9B%B8%E5%85%B3","adTrack":null},{"id":496,"name":"致敬","actionUrl":"eyepetizer://tag/496/?title=%E8%87%B4%E6%95%AC","adTrack":null},{"id":34,"name":"混剪","actionUrl":"eyepetizer://tag/34/?title=%E6%B7%B7%E5%89%AA","adTrack":null}]
                 * type : NORMAL
                 * titlePgc : null
                 * descriptionPgc : null
                 * remark : One of the best directors of the last 20 years. David Fincher mixes perfection in the execution of a film with intriguing plots, great dialogue, fantástic soundtrack and excellent perfomances. His films are smart and suspenseful, with attention in every detail. This are his films. Enjoy! Clarification: Although Alien3 was his first film, I didn't include it because David himself hates it. The producers didn't let him do the movie he wanted and there´s little of his talent in that movie. So, for respect to Fincher, I didn't include it.
                 * idx : 0
                 * shareAdTrack : null
                 * favoriteAdTrack : null
                 * webAdTrack : null
                 * date : 1503882000000
                 * promotion : null
                 * label : null
                 * labelList : []
                 * descriptionEditor : 今天是著名美国导演大卫·芬奇的生日，「七宗罪」、「搏击俱乐部」、「返老还童」等经典电影皆出自他手。这条短片集合了他的所有电影。唯一没有被录入的是「异形 3」，这虽然是大卫的第一部电影，但由于他本人其实并不喜欢这部影片，怀着这样的心情，作者便把它从集锦中除去了。From Gabriel Fasano
                 * collected : false
                 * played : false
                 * subtitles : []
                 * lastViewTime : null
                 * playlists : null
                 */

                private String dataType;
                private String id;
                private String text;
                private String font;

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public String getFont() {
                    return font;
                }

                public void setFont(String font) {
                    this.font = font;
                }

                private String title;
                private String slogan;
                private String description;
                private String image;
                private String actionUrl;
                private boolean shade;

                public String getImage() {
                    return image;
                }

                public void setImage(String image) {
                    this.image = image;
                }

                public String getActionUrl() {
                    return actionUrl;
                }

                public void setActionUrl(String actionUrl) {
                    this.actionUrl = actionUrl;
                }

                public boolean isShade() {
                    return shade;
                }

                public void setShade(boolean shade) {
                    this.shade = shade;
                }

                private ProviderBean provider;
                private String category;
                private Object author;
                private CoverBean cover;
                private String playUrl;
                private Object thumbPlayUrl;
                private int duration;
                private WebUrlBean webUrl;
                private long releaseTime;
                private String library;
                private ConsumptionBean consumption;
                private Object campaign;
                private Object waterMarks;
                private Object adTrack;
                private String type;
                private Object titlePgc;
                private Object descriptionPgc;
                private String remark;
                private int idx;
                private Object shareAdTrack;
                private Object favoriteAdTrack;
                private Object webAdTrack;
                private long date;
                private Object promotion;
                private Object label;
                private String descriptionEditor;
                private boolean collected;
                private boolean played;
                private Object lastViewTime;
                private Object playlists;
                private List<PlayInfoBean> playInfo;
                private List<TagsBean> tags;
                private List<?> labelList;
                private List<?> subtitles;

                public String getDataType() {
                    return dataType;
                }

                public void setDataType(String dataType) {
                    this.dataType = dataType;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getSlogan() {
                    return slogan;
                }

                public void setSlogan(String slogan) {
                    this.slogan = slogan;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public ProviderBean getProvider() {
                    return provider;
                }

                public void setProvider(ProviderBean provider) {
                    this.provider = provider;
                }

                public String getCategory() {
                    return category;
                }

                public void setCategory(String category) {
                    this.category = category;
                }

                public Object getAuthor() {
                    return author;
                }

                public void setAuthor(Object author) {
                    this.author = author;
                }

                public CoverBean getCover() {
                    return cover;
                }

                public void setCover(CoverBean cover) {
                    this.cover = cover;
                }

                public String getPlayUrl() {
                    return playUrl;
                }

                public void setPlayUrl(String playUrl) {
                    this.playUrl = playUrl;
                }

                public Object getThumbPlayUrl() {
                    return thumbPlayUrl;
                }

                public void setThumbPlayUrl(Object thumbPlayUrl) {
                    this.thumbPlayUrl = thumbPlayUrl;
                }

                public int getDuration() {
                    return duration;
                }

                public void setDuration(int duration) {
                    this.duration = duration;
                }

                public WebUrlBean getWebUrl() {
                    return webUrl;
                }

                public void setWebUrl(WebUrlBean webUrl) {
                    this.webUrl = webUrl;
                }

                public long getReleaseTime() {
                    return releaseTime;
                }

                public void setReleaseTime(long releaseTime) {
                    this.releaseTime = releaseTime;
                }

                public String getLibrary() {
                    return library;
                }

                public void setLibrary(String library) {
                    this.library = library;
                }

                public ConsumptionBean getConsumption() {
                    return consumption;
                }

                public void setConsumption(ConsumptionBean consumption) {
                    this.consumption = consumption;
                }

                public Object getCampaign() {
                    return campaign;
                }

                public void setCampaign(Object campaign) {
                    this.campaign = campaign;
                }

                public Object getWaterMarks() {
                    return waterMarks;
                }

                public void setWaterMarks(Object waterMarks) {
                    this.waterMarks = waterMarks;
                }

                public Object getAdTrack() {
                    return adTrack;
                }

                public void setAdTrack(Object adTrack) {
                    this.adTrack = adTrack;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public Object getTitlePgc() {
                    return titlePgc;
                }

                public void setTitlePgc(Object titlePgc) {
                    this.titlePgc = titlePgc;
                }

                public Object getDescriptionPgc() {
                    return descriptionPgc;
                }

                public void setDescriptionPgc(Object descriptionPgc) {
                    this.descriptionPgc = descriptionPgc;
                }

                public String getRemark() {
                    return remark;
                }

                public void setRemark(String remark) {
                    this.remark = remark;
                }

                public int getIdx() {
                    return idx;
                }

                public void setIdx(int idx) {
                    this.idx = idx;
                }

                public Object getShareAdTrack() {
                    return shareAdTrack;
                }

                public void setShareAdTrack(Object shareAdTrack) {
                    this.shareAdTrack = shareAdTrack;
                }

                public Object getFavoriteAdTrack() {
                    return favoriteAdTrack;
                }

                public void setFavoriteAdTrack(Object favoriteAdTrack) {
                    this.favoriteAdTrack = favoriteAdTrack;
                }

                public Object getWebAdTrack() {
                    return webAdTrack;
                }

                public void setWebAdTrack(Object webAdTrack) {
                    this.webAdTrack = webAdTrack;
                }

                public long getDate() {
                    return date;
                }

                public void setDate(long date) {
                    this.date = date;
                }

                public Object getPromotion() {
                    return promotion;
                }

                public void setPromotion(Object promotion) {
                    this.promotion = promotion;
                }

                public Object getLabel() {
                    return label;
                }

                public void setLabel(Object label) {
                    this.label = label;
                }

                public String getDescriptionEditor() {
                    return descriptionEditor;
                }

                public void setDescriptionEditor(String descriptionEditor) {
                    this.descriptionEditor = descriptionEditor;
                }

                public boolean isCollected() {
                    return collected;
                }

                public void setCollected(boolean collected) {
                    this.collected = collected;
                }

                public boolean isPlayed() {
                    return played;
                }

                public void setPlayed(boolean played) {
                    this.played = played;
                }

                public Object getLastViewTime() {
                    return lastViewTime;
                }

                public void setLastViewTime(Object lastViewTime) {
                    this.lastViewTime = lastViewTime;
                }

                public Object getPlaylists() {
                    return playlists;
                }

                public void setPlaylists(Object playlists) {
                    this.playlists = playlists;
                }

                public List<PlayInfoBean> getPlayInfo() {
                    return playInfo;
                }

                public void setPlayInfo(List<PlayInfoBean> playInfo) {
                    this.playInfo = playInfo;
                }

                public List<TagsBean> getTags() {
                    return tags;
                }

                public void setTags(List<TagsBean> tags) {
                    this.tags = tags;
                }

                public List<?> getLabelList() {
                    return labelList;
                }

                public void setLabelList(List<?> labelList) {
                    this.labelList = labelList;
                }

                public List<?> getSubtitles() {
                    return subtitles;
                }

                public void setSubtitles(List<?> subtitles) {
                    this.subtitles = subtitles;
                }

                public static class ProviderBean implements Serializable{
                    /**
                     * name : Vimeo
                     * alias : vimeo
                     * icon : http://img.kaiyanapp.com/c3ad630be461cbb081649c9e21d6cbe3.png
                     */

                    private String name;
                    private String alias;
                    private String icon;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getAlias() {
                        return alias;
                    }

                    public void setAlias(String alias) {
                        this.alias = alias;
                    }

                    public String getIcon() {
                        return icon;
                    }

                    public void setIcon(String icon) {
                        this.icon = icon;
                    }
                }

                public static class CoverBean implements  Serializable {
                    /**
                     * feed : http://img.kaiyanapp.com/db2a2a46a9774f9e058dc7e1dfdd0bc0.jpeg?imageMogr2/quality/60/format/jpg
                     * detail : http://img.kaiyanapp.com/db2a2a46a9774f9e058dc7e1dfdd0bc0.jpeg?imageMogr2/quality/60/format/jpg
                     * blurred : http://img.kaiyanapp.com/b6ff175449cc8d6251e926f98ba78069.jpeg?imageMogr2/quality/60/format/jpg
                     * sharing : null
                     * homepage : http://img.kaiyanapp.com/db2a2a46a9774f9e058dc7e1dfdd0bc0.jpeg?imageView2/1/w/720/h/560/format/jpg/q/75|watermark/1/image/aHR0cDovL2ltZy5rYWl5YW5hcHAuY29tL2JsYWNrXzMwLnBuZw==/dissolve/100/gravity/Center/dx/0/dy/0|imageslim
                     */

                    private String feed;
                    private String detail;
                    private String blurred;
                    private Object sharing;
                    private String homepage;

                    public String getFeed() {
                        return feed;
                    }

                    public void setFeed(String feed) {
                        this.feed = feed;
                    }

                    public String getDetail() {
                        return detail;
                    }

                    public void setDetail(String detail) {
                        this.detail = detail;
                    }

                    public String getBlurred() {
                        return blurred;
                    }

                    public void setBlurred(String blurred) {
                        this.blurred = blurred;
                    }

                    public Object getSharing() {
                        return sharing;
                    }

                    public void setSharing(Object sharing) {
                        this.sharing = sharing;
                    }

                    public String getHomepage() {
                        return homepage;
                    }

                    public void setHomepage(String homepage) {
                        this.homepage = homepage;
                    }
                }

                public static class WebUrlBean implements  Serializable{
                    /**
                     * raw : http://www.eyepetizer.net/detail.html?vid=17630
                     * forWeibo : http://wandou.im/3mg1rz
                     */

                    private String raw;
                    private String forWeibo;

                    public String getRaw() {
                        return raw;
                    }

                    public void setRaw(String raw) {
                        this.raw = raw;
                    }

                    public String getForWeibo() {
                        return forWeibo;
                    }

                    public void setForWeibo(String forWeibo) {
                        this.forWeibo = forWeibo;
                    }
                }

                public static class ConsumptionBean implements Serializable{
                    /**
                     * collectionCount : 213
                     * shareCount : 64
                     * replyCount : 3
                     */

                    private int collectionCount;
                    private int shareCount;
                    private int replyCount;

                    public int getCollectionCount() {
                        return collectionCount;
                    }

                    public void setCollectionCount(int collectionCount) {
                        this.collectionCount = collectionCount;
                    }

                    public int getShareCount() {
                        return shareCount;
                    }

                    public void setShareCount(int shareCount) {
                        this.shareCount = shareCount;
                    }

                    public int getReplyCount() {
                        return replyCount;
                    }

                    public void setReplyCount(int replyCount) {
                        this.replyCount = replyCount;
                    }
                }

                public static class PlayInfoBean implements  Serializable{
                    /**
                     * height : 480
                     * width : 854
                     * urlList : [{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=17630&editionType=normal&source=qcloud","size":23282341},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=17630&editionType=normal&source=ucloud","size":23282341}]
                     * name : 标清
                     * type : normal
                     * url : http://baobab.kaiyanapp.com/api/v1/playUrl?vid=17630&editionType=normal&source=qcloud
                     */

                    private int height;
                    private int width;
                    private String name;
                    private String type;
                    private String url;
                    private List<UrlListBean> urlList;

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public List<UrlListBean> getUrlList() {
                        return urlList;
                    }

                    public void setUrlList(List<UrlListBean> urlList) {
                        this.urlList = urlList;
                    }

                    public static class UrlListBean implements  Serializable{
                        /**
                         * name : qcloud
                         * url : http://baobab.kaiyanapp.com/api/v1/playUrl?vid=17630&editionType=normal&source=qcloud
                         * size : 23282341
                         */

                        private String name;
                        private String url;
                        private int size;

                        public String getName() {
                            return name;
                        }

                        public void setName(String name) {
                            this.name = name;
                        }

                        public String getUrl() {
                            return url;
                        }

                        public void setUrl(String url) {
                            this.url = url;
                        }

                        public int getSize() {
                            return size;
                        }

                        public void setSize(int size) {
                            this.size = size;
                        }
                    }
                }

                public static class TagsBean implements  Serializable{
                    /**
                     * id : 36
                     * name : 集锦
                     * actionUrl : eyepetizer://tag/36/?title=%E9%9B%86%E9%94%A6
                     * adTrack : null
                     */

                    private int id;
                    private String name;
                    private String actionUrl;
                    private Object adTrack;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getActionUrl() {
                        return actionUrl;
                    }

                    public void setActionUrl(String actionUrl) {
                        this.actionUrl = actionUrl;
                    }

                    public Object getAdTrack() {
                        return adTrack;
                    }

                    public void setAdTrack(Object adTrack) {
                        this.adTrack = adTrack;
                    }
                }
            }
        }
    }
}
