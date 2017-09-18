package com.wrg.widen.Model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by 翁 on 2017/9/7.
 */

public class ClassifyEntity {


    @Override
    public String   toString() {
        return "ClassifyEntity{" +
                "count=" + count +
                ", total=" + total +
                ", nextPageUrl='" + nextPageUrl + '\'' +
                ", itemList=" + itemList +
                '}';
    }

    /**
     * itemList : [{"type":"squareCardCollection","data":{"dataType":"ItemCollection","header":{"id":1,"title":"热门分类","font":"bold","cover":null,"label":null,"actionUrl":"eyepetizer://categories/all","labelList":null},"itemList":[{"type":"squareCard","data":{"dataType":"SquareCard","id":2,"title":"#创意","image":"http://img.kaiyanapp.com/f4a9aba1c6857ee0cefcdc5aee0a1fc9.png?imageMogr2/quality/60/format/jpg","actionUrl":"eyepetizer://category/2/?title=%E5%88%9B%E6%84%8F","shade":true,"adTrack":null},"tag":null},{"type":"squareCard","data":{"dataType":"SquareCard","id":18,"title":"#运动","image":"http://img.kaiyanapp.com/c746d56db089909b1cdd933fa7c98ef8.jpeg","actionUrl":"eyepetizer://category/18/?title=%E8%BF%90%E5%8A%A8","shade":true,"adTrack":null},"tag":null},{"type":"squareCard","data":{"dataType":"SquareCard","id":20,"title":"#音乐","image":"http://img.kaiyanapp.com/9279c17b4da5ba5e7e4f21afb5bb0a74.jpeg","actionUrl":"eyepetizer://category/20/?title=%E9%9F%B3%E4%B9%90","shade":true,"adTrack":null},"tag":null},{"type":"squareCard","data":{"dataType":"SquareCard","id":4,"title":"#开胃","image":"http://img.kaiyanapp.com/5817f1bfdce61130204a24268160b619.jpeg","actionUrl":"eyepetizer://category/4/?title=%E5%BC%80%E8%83%83","shade":true,"adTrack":null},"tag":null},{"type":"squareCard","data":{"dataType":"SquareCard","id":22,"title":"#记录","image":"http://img.kaiyanapp.com/a2fc6d32ac0b4f2842fb3d545d06f09b.jpeg","actionUrl":"eyepetizer://category/22/?title=%E8%AE%B0%E5%BD%95","shade":true,"adTrack":null},"tag":null},{"type":"actionCard","data":{"dataType":"ActionCard","id":0,"text":"查看全部","actionUrl":"eyepetizer://categories/all","adTrack":null},"tag":null}],"count":6,"adTrack":null},"tag":null},{"type":"bannerCollection","data":{"dataType":"ItemCollection","header":{"id":4,"title":"热门专题","font":"bold","cover":null,"label":null,"actionUrl":"eyepetizer://campaign/list/?title=%E4%B8%93%E9%A2%98","labelList":null},"itemList":[{"type":"banner2","data":{"dataType":"Banner","id":197,"title":"","description":"","image":"http://img.kaiyanapp.com/e7e150a9bf921f7830b96f67c73726c1.jpeg?imageMogr2/quality/60/format/jpg","actionUrl":"eyepetizer://webview/?title=%E6%89%93%E7%A0%B4%EF%BC%81%E6%97%A5%E5%A4%8D%E4%B8%80%E6%97%A5%E7%9A%84%E8%81%8C%E5%9C%BA%E7%94%9F%E6%B4%BB&url=http%3A%2F%2Fwww.eyepetizer.net%2Fvideos_article.html%3Fnid%3D197%26shareable%3Dtrue","adTrack":null,"shade":false,"label":{"text":"","card":"","detail":null},"labelList":[],"header":null},"tag":null},{"type":"banner2","data":{"dataType":"Banner","id":195,"title":"","description":"","image":"http://img.kaiyanapp.com/81e3a13b7946bec39e9b3aeb0dbe2eb8.jpeg?imageMogr2/quality/60/format/jpg","actionUrl":"eyepetizer://webview/?title=%E8%84%91%E6%B4%9E%E5%88%B0%E5%BA%95%E9%95%BF%E5%95%A5%E6%A0%B7%EF%BC%9F&url=http%3A%2F%2Fwww.eyepetizer.net%2Fvideos_article.html%3Fnid%3D195%26shareable%3Dtrue","adTrack":null,"shade":false,"label":{"text":"","card":"","detail":null},"labelList":[],"header":null},"tag":null},{"type":"banner2","data":{"dataType":"Banner","id":193,"title":"","description":"","image":"http://img.kaiyanapp.com/098936e1f010781c1c51ed2283c4391e.jpeg?imageMogr2/quality/60/format/jpg","actionUrl":"eyepetizer://webview/?title=%E3%80%8C%E6%95%A6%E5%88%BB%E5%B0%94%E5%85%8B%E3%80%8D%E8%AE%BF%E8%B0%88%E7%89%B9%E8%BE%91%EF%BC%9A%E8%AF%BA%E5%85%B0%E4%BA%B2%E8%87%AA%E8%A7%A3%E5%AF%86%E5%B9%95%E5%90%8E%E6%95%85%E4%BA%8B&url=http%3A%2F%2Fwww.eyepetizer.net%2Fvideos_article.html%3Fnid%3D193%26shareable%3Dtrue","adTrack":null,"shade":false,"label":{"text":"","card":"","detail":null},"labelList":[],"header":null},"tag":null},{"type":"banner2","data":{"dataType":"Banner","id":194,"title":"","description":"","image":"http://img.kaiyanapp.com/a8b45f925141c13a8967a984bf72d440.jpeg?imageMogr2/quality/60/format/jpg","actionUrl":"eyepetizer://webview/?title=%E3%80%8CCCTV+%E6%85%88%E5%96%84%E4%B9%8B%E5%A4%9C%E3%80%8D%E5%96%84%E8%A1%8C%E5%B1%95%E6%92%AD%EF%BC%9A9+%E6%9C%88%E7%88%B1%E5%BF%83%E6%8E%A5%E5%8A%9B&url=http%3A%2F%2Fwww.eyepetizer.net%2Fvideos_article.html%3Fnid%3D194%26shareable%3Dtrue","adTrack":null,"shade":false,"label":{"text":"","card":"","detail":null},"labelList":[],"header":null},"tag":null},{"type":"banner2","data":{"dataType":"Banner","id":192,"title":"","description":"","image":"http://img.kaiyanapp.com/d60e3031bf9487855b6e53c25ed59b0b.jpeg?imageMogr2/quality/60/format/jpg","actionUrl":"eyepetizer://webview/?title=%E5%BC%80%E5%AD%A6%E4%BA%86%EF%BC%8C%E4%B8%BA%E4%BD%95%E4%B8%8D%E6%83%B3%E5%8E%BB%E5%AD%A6%E6%A0%A1%EF%BC%9F%E4%B9%9F%E8%AE%B8%E6%98%AF%E5%9B%A0%E4%B8%BA%E2%80%A6%E2%80%A6&url=http%3A%2F%2Fwww.eyepetizer.net%2Fvideos_article.html%3Fnid%3D192%26shareable%3Dtrue","adTrack":null,"shade":false,"label":{"text":"","card":"","detail":null},"labelList":[],"header":null},"tag":null}],"count":5,"adTrack":null},"tag":null},{"type":"videoCollectionOfHorizontalScrollCard","data":{"dataType":"ItemCollection","header":{"id":20,"title":"音乐","font":"normal","cover":null,"label":null,"actionUrl":"eyepetizer://category/20/?title=%E9%9F%B3%E4%B9%90","labelList":null,"subTitle":"全球最酷、最炫、最有态度的音乐集合","follow":{"itemType":"category","itemId":20,"followed":false}},"itemList":[{"type":"video","data":{"dataType":"VideoBeanForClient","id":49197,"title":"数电都市-阿姆斯特丹001","slogan":null,"description":"DGTL presents MODULAR 2017","provider":{"name":"PGC","alias":"PGC","icon":""},"category":"音乐","author":{"id":1605,"icon":"http://img.kaiyanapp.com/18aadfa1ce58687712601906fc3795a8.png?imageMogr2/quality/60/format/jpg","name":"山海记","description":"音乐目的地","link":"","latestReleaseTime":1504761519000,"videoNum":10,"adTrack":null,"follow":{"itemType":"author","itemId":1605,"followed":false},"shield":{"itemType":"author","itemId":1605,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true},"cover":{"feed":"http://img.kaiyanapp.com/126eda7ff2eaeab5df86863a947f96cc.png?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/126eda7ff2eaeab5df86863a947f96cc.png?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/4e2cf0dc986b512533e372a406c98b46.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":null},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49197&editionType=default&source=qcloud","thumbPlayUrl":null,"duration":619,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=49197","forWeibo":"http://wandou.im/3oa7ec"},"releaseTime":1504761519000,"library":"DEFAULT","playInfo":[{"height":720,"width":1280,"urlList":[{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49197&editionType=high&source=qcloud","size":121417713},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49197&editionType=high&source=ucloud","size":121417713}],"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49197&editionType=high&source=qcloud"}],"consumption":{"collectionCount":0,"shareCount":0,"replyCount":0},"campaign":null,"waterMarks":null,"adTrack":null,"tags":[],"type":"NORMAL","titlePgc":"数电都市-阿姆斯特丹001","descriptionPgc":"DGTL presents MODULAR 2017","remark":"","idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1504761519000,"promotion":null,"label":null,"labelList":[],"descriptionEditor":"","collected":false,"played":false,"subtitles":[],"lastViewTime":null,"playlists":null},"tag":null},{"type":"video","data":{"dataType":"VideoBeanForClient","id":49195,"title":"EDM明日世界，比利时未来乐园","slogan":null,"description":"全球最知名的EDM音乐节，在这个奇幻乐园里，数十个舞台数百位DJ所带来的三天狂欢，和数十万人一起期待明天的感觉，造就了Tomorrowland的无以伦比。","provider":{"name":"PGC","alias":"PGC","icon":""},"category":"音乐","author":{"id":1605,"icon":"http://img.kaiyanapp.com/18aadfa1ce58687712601906fc3795a8.png?imageMogr2/quality/60/format/jpg","name":"山海记","description":"音乐目的地","link":"","latestReleaseTime":1504761519000,"videoNum":10,"adTrack":null,"follow":{"itemType":"author","itemId":1605,"followed":false},"shield":{"itemType":"author","itemId":1605,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true},"cover":{"feed":"http://img.kaiyanapp.com/a9bb75221d0b8eef3379b47b9c9bd8ea.png?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/a9bb75221d0b8eef3379b47b9c9bd8ea.png?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/9c40ea8e4aeb6ca67a697e0b7b5f8805.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":null},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49195&editionType=default&source=qcloud","thumbPlayUrl":null,"duration":1571,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=49195","forWeibo":"http://wandou.im/3oa7d6"},"releaseTime":1504761092000,"library":"DEFAULT","playInfo":[{"height":720,"width":1280,"urlList":[{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49195&editionType=high&source=qcloud","size":487681041},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49195&editionType=high&source=ucloud","size":487681041}],"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49195&editionType=high&source=qcloud"}],"consumption":{"collectionCount":0,"shareCount":2,"replyCount":0},"campaign":null,"waterMarks":null,"adTrack":null,"tags":[],"type":"NORMAL","titlePgc":"EDM明日世界，比利时未来乐园","descriptionPgc":"全球最知名的EDM音乐节，在这个奇幻乐园里，数十个舞台数百位DJ所带来的三天狂欢，和数十万人一起期待明天的感觉，造就了Tomorrowland的无以伦比。","remark":"","idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1504761092000,"promotion":null,"label":null,"labelList":[],"descriptionEditor":"","collected":false,"played":false,"subtitles":[],"lastViewTime":null,"playlists":null},"tag":null},{"type":"video","data":{"dataType":"VideoBeanForClient","id":49182,"title":"第37期BillboardTOP10","slogan":null,"description":"【Chart】第37期Billboard公告牌TOP10！霉霉Taylor Swift回归新单《Look What You Made Me Do》强势登顶！","provider":{"name":"PGC","alias":"PGC","icon":""},"category":"音乐","author":{"id":1446,"icon":"http://img.kaiyanapp.com/27c99a457bc2d340faa9ab8e751e99e5.png?imageMogr2/quality/60/format/jpg","name":"DRIFTMusic","description":"推荐优质的音乐视频（MV、翻唱、混音、现场），以及YouTube热门视频","link":"","latestReleaseTime":1504758883000,"videoNum":415,"adTrack":null,"follow":{"itemType":"author","itemId":1446,"followed":false},"shield":{"itemType":"author","itemId":1446,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true},"cover":{"feed":"http://img.kaiyanapp.com/c8d3c7b0720f782852b7a4d87cf264ab.png?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/c8d3c7b0720f782852b7a4d87cf264ab.png?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/64cb51b6671df6412be9d547b323ede2.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":null},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49182&editionType=default&source=qcloud","thumbPlayUrl":null,"duration":136,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=49182","forWeibo":"http://wandou.im/3oa76x"},"releaseTime":1504758883000,"library":"DEFAULT","playInfo":[{"height":480,"width":854,"urlList":[{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49182&editionType=normal&source=qcloud","size":14618174},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49182&editionType=normal&source=ucloud","size":14618174}],"name":"标清","type":"normal","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49182&editionType=normal&source=qcloud"},{"height":720,"width":1280,"urlList":[{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49182&editionType=high&source=qcloud","size":23757056},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49182&editionType=high&source=ucloud","size":23757056}],"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49182&editionType=high&source=qcloud"}],"consumption":{"collectionCount":0,"shareCount":0,"replyCount":0},"campaign":null,"waterMarks":null,"adTrack":null,"tags":[],"type":"NORMAL","titlePgc":"第37期BillboardTOP10","descriptionPgc":"【Chart】第37期Billboard公告牌TOP10！霉霉Taylor Swift回归新单《Look What You Made Me Do》强势登顶！","remark":"","idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1504758883000,"promotion":null,"label":null,"labelList":[],"descriptionEditor":"","collected":false,"played":false,"subtitles":[],"lastViewTime":null,"playlists":null},"tag":null},{"type":"video","data":{"dataType":"VideoBeanForClient","id":49179,"title":"1MILLION编舞 by J.Y","slogan":null,"description":"【Choreography】1MILLION编舞DJ Khaled联手Rihanna和Bryson Tiller的热单《Wild Thoughts》by Jiyoung Youn","provider":{"name":"PGC","alias":"PGC","icon":""},"category":"音乐","author":{"id":1446,"icon":"http://img.kaiyanapp.com/27c99a457bc2d340faa9ab8e751e99e5.png?imageMogr2/quality/60/format/jpg","name":"DRIFTMusic","description":"推荐优质的音乐视频（MV、翻唱、混音、现场），以及YouTube热门视频","link":"","latestReleaseTime":1504758883000,"videoNum":415,"adTrack":null,"follow":{"itemType":"author","itemId":1446,"followed":false},"shield":{"itemType":"author","itemId":1446,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true},"cover":{"feed":"http://img.kaiyanapp.com/c8a4cc9b6b845092458af84628fa24a4.png?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/c8a4cc9b6b845092458af84628fa24a4.png?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/d13f6080f85f32d73f09089ebab5c425.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":null},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49179&editionType=default&source=qcloud","thumbPlayUrl":null,"duration":118,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=49179","forWeibo":"http://wandou.im/3oa75o"},"releaseTime":1504758404000,"library":"DEFAULT","playInfo":[{"height":480,"width":854,"urlList":[{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49179&editionType=normal&source=qcloud","size":8733956},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49179&editionType=normal&source=ucloud","size":8733956}],"name":"标清","type":"normal","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49179&editionType=normal&source=qcloud"},{"height":720,"width":1280,"urlList":[{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49179&editionType=high&source=qcloud","size":14739922},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49179&editionType=high&source=ucloud","size":14739922}],"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49179&editionType=high&source=qcloud"}],"consumption":{"collectionCount":0,"shareCount":0,"replyCount":0},"campaign":null,"waterMarks":null,"adTrack":null,"tags":[],"type":"NORMAL","titlePgc":"1MILLION编舞 by J.Y","descriptionPgc":"【Choreography】1MILLION编舞DJ Khaled联手Rihanna和Bryson Tiller的热单《Wild Thoughts》by Jiyoung Youn","remark":"","idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1504758404000,"promotion":null,"label":null,"labelList":[],"descriptionEditor":"","collected":false,"played":false,"subtitles":[],"lastViewTime":null,"playlists":null},"tag":null},{"type":"video","data":{"dataType":"VideoBeanForClient","id":4496,"title":"材质拼贴定格动画 MV：Oasis","slogan":null,"description":"委内瑞拉裔法国音乐人 La Chica 擅长将传统拉美音乐和流行电子乐结合做出自己的风格。其作品「Oasis」的 MV 是一支材质拼贴定格动画。MV 中只是一个女人对着你唱歌，但当她睁眼，你就会发现她的不平凡。From NOAMIR","provider":{"name":"Vimeo","alias":"vimeo","icon":"http://img.kaiyanapp.com/c3ad630be461cbb081649c9e21d6cbe3.png"},"category":"音乐","author":null,"cover":{"feed":"http://img.kaiyanapp.com/c37db13db5a7483e43b605b3a8c2c8e9.jpeg?imageMogr2/quality/100","detail":"http://img.kaiyanapp.com/c37db13db5a7483e43b605b3a8c2c8e9.jpeg?imageMogr2/quality/100","blurred":"http://img.kaiyanapp.com/a3e6774ea261d4bbe9881688147eda14.jpeg?imageMogr2/quality/100","sharing":null,"homepage":null},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=4496&editionType=default&source=qcloud","thumbPlayUrl":null,"duration":235,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=4496","forWeibo":"http://wandou.im/15jjoj"},"releaseTime":1479819600000,"library":"DAILY","playInfo":[{"height":480,"width":848,"urlList":[{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=4496&editionType=normal&source=qcloud","size":18971390},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=4496&editionType=normal&source=ucloud","size":18971390}],"name":"标清","type":"normal","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=4496&editionType=normal&source=qcloud"},{"height":720,"width":1280,"urlList":[{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=4496&editionType=high&source=qcloud","size":78284029},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=4496&editionType=high&source=ucloud","size":78284029}],"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=4496&editionType=high&source=qcloud"}],"consumption":{"collectionCount":1590,"shareCount":723,"replyCount":21},"campaign":null,"waterMarks":null,"adTrack":null,"tags":[{"id":18,"name":"音乐","actionUrl":"eyepetizer://tag/18/?title=%E9%9F%B3%E4%B9%90","adTrack":null},{"id":590,"name":"拼贴","actionUrl":"eyepetizer://tag/590/?title=%E6%8B%BC%E8%B4%B4","adTrack":null},{"id":82,"name":"定格","actionUrl":"eyepetizer://tag/82/?title=%E5%AE%9A%E6%A0%BC","adTrack":null},{"id":66,"name":"平面设计","actionUrl":"eyepetizer://tag/66/?title=%E5%B9%B3%E9%9D%A2%E8%AE%BE%E8%AE%A1","adTrack":null},{"id":94,"name":"实验性","actionUrl":"eyepetizer://tag/94/?title=%E5%AE%9E%E9%AA%8C%E6%80%A7","adTrack":null}],"type":"NORMAL","titlePgc":null,"descriptionPgc":null,"remark":null,"idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1479819600000,"promotion":null,"label":null,"labelList":[],"descriptionEditor":"委内瑞拉裔法国音乐人 La Chica 擅长将传统拉美音乐和流行电子乐结合做出自己的风格。其作品「Oasis」的 MV 是一支材质拼贴定格动画。MV 中只是一个女人对着你唱歌，但当她睁眼，你就会发现她的不平凡。From NOAMIR","collected":false,"played":false,"subtitles":[],"lastViewTime":null,"playlists":null},"tag":null}],"count":5,"adTrack":null},"tag":null},{"type":"videoCollectionOfHorizontalScrollCard","data":{"dataType":"ItemCollection","header":{"id":4,"title":"开胃","font":"normal","cover":null,"label":null,"actionUrl":"eyepetizer://category/4/?title=%E5%BC%80%E8%83%83","labelList":null,"subTitle":"眼球和味蕾，一个都不放过","follow":{"itemType":"category","itemId":4,"followed":false}},"itemList":[{"type":"video","data":{"dataType":"VideoBeanForClient","id":49193,"title":"红遍全球的网红蛋到底有多好吃?","slogan":null,"description":"《空腹》第十七话「酥炸牛肉裹温泉蛋 」金黄酥脆的外表却包裹着一个可口温柔的蛋，咬下一口流心蛋黄瞬间和酥脆的牛肉混为一体，让人幸福满满！本期三轮叔带来这款网红蛋，实力爆浆，颜值和美味俱在。","provider":{"name":"PGC","alias":"PGC","icon":""},"category":"开胃","author":{"id":50,"icon":"http://img.kaiyanapp.com/0c95c83b59d97314f5b03c97175d6ebb.jpeg","name":"空腹","description":"肚子饿了，就要好好吃饭！美味来袭，请空腹等待！","link":"","latestReleaseTime":1504760643000,"videoNum":31,"adTrack":null,"follow":{"itemType":"author","itemId":50,"followed":false},"shield":{"itemType":"author","itemId":50,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true},"cover":{"feed":"http://img.kaiyanapp.com/07698acfe64a395832f0f3ef92968dd8.png?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/07698acfe64a395832f0f3ef92968dd8.png?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/39598627e287696a45541e6b82bd6164.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":null},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49193&editionType=default&source=qcloud","thumbPlayUrl":null,"duration":260,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=49193","forWeibo":"http://wandou.im/3oa7bz"},"releaseTime":1504760643000,"library":"DEFAULT","playInfo":[{"height":480,"width":854,"urlList":[{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49193&editionType=normal&source=qcloud","size":22986084},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49193&editionType=normal&source=ucloud","size":22986084}],"name":"标清","type":"normal","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49193&editionType=normal&source=qcloud"},{"height":720,"width":1280,"urlList":[{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49193&editionType=high&source=qcloud","size":38967480},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49193&editionType=high&source=ucloud","size":38967480}],"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49193&editionType=high&source=qcloud"}],"consumption":{"collectionCount":11,"shareCount":4,"replyCount":0},"campaign":null,"waterMarks":null,"adTrack":null,"tags":[],"type":"NORMAL","titlePgc":"红遍全球的网红蛋到底有多好吃?","descriptionPgc":"《空腹》第十七话「酥炸牛肉裹温泉蛋 」金黄酥脆的外表却包裹着一个可口温柔的蛋，咬下一口流心蛋黄瞬间和酥脆的牛肉混为一体，让人幸福满满！本期三轮叔带来这款网红蛋，实力爆浆，颜值和美味俱在。","remark":"","idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1504760643000,"promotion":null,"label":null,"labelList":[],"descriptionEditor":"","collected":false,"played":false,"subtitles":[],"lastViewTime":null,"playlists":null},"tag":null},{"type":"video","data":{"dataType":"VideoBeanForClient","id":49187,"title":"节气美食-白露：应季椰子两道菜","slogan":null,"description":"白露已到，昼夜温差加大，快来吃点椰子，补虚强壮、益气祛风~","provider":{"name":"PGC","alias":"PGC","icon":""},"category":"开胃","author":{"id":1783,"icon":"http://img.kaiyanapp.com/c62589f6bbae9001fa54b41cfa9cf147.png?imageMogr2/quality/60/format/jpg","name":"丰盛良食","description":"一个健康料理频道，一本生活美食手帐，一份光影人生情怀。","link":"","latestReleaseTime":1504759529000,"videoNum":2,"adTrack":null,"follow":{"itemType":"author","itemId":1783,"followed":false},"shield":{"itemType":"author","itemId":1783,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true},"cover":{"feed":"http://img.kaiyanapp.com/f3180769a0d6cf6e2482553fbb89f35f.png?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/f3180769a0d6cf6e2482553fbb89f35f.png?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/a57b52243faae0577d6507c76bd20fb4.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":null},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49187&editionType=default&source=qcloud","thumbPlayUrl":null,"duration":215,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=49187","forWeibo":"http://wandou.im/3oa78q"},"releaseTime":1504759529000,"library":"DEFAULT","playInfo":[{"height":480,"width":854,"urlList":[{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49187&editionType=normal&source=qcloud","size":22649705},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49187&editionType=normal&source=ucloud","size":22649705}],"name":"标清","type":"normal","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49187&editionType=normal&source=qcloud"},{"height":720,"width":1280,"urlList":[{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49187&editionType=high&source=qcloud","size":38033951},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49187&editionType=high&source=ucloud","size":38033951}],"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49187&editionType=high&source=qcloud"}],"consumption":{"collectionCount":2,"shareCount":4,"replyCount":0},"campaign":null,"waterMarks":null,"adTrack":null,"tags":[],"type":"NORMAL","titlePgc":"节气美食-白露：应季椰子两道菜","descriptionPgc":"白露已到，昼夜温差加大，快来吃点椰子，补虚强壮、益气祛风~","remark":"","idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1504759529000,"promotion":null,"label":null,"labelList":[],"descriptionEditor":"","collected":false,"played":false,"subtitles":[],"lastViewTime":null,"playlists":null},"tag":null},{"type":"video","data":{"dataType":"VideoBeanForClient","id":49184,"title":"五花肉配卷心菜，这煎饼很厉害！","slogan":null,"description":"人见人爱的煎饼果子，现在流行加各种料，榨菜、肉松、火腿肠，想加什么加什么。在日本关西一带，有一种煎饼也是这样，它叫大阪烧（Okonomiyaki），原本的意思就是\u201c想加什么就加什么煎饼\u201d.","provider":{"name":"PGC","alias":"PGC","icon":""},"category":"开胃","author":{"id":174,"icon":"http://img.kaiyanapp.com/ddc5c8162f82415c44d88395bdb86a2b.jpeg","name":"美食台","description":"饿了记得来找我们！","link":"","latestReleaseTime":1504759097000,"videoNum":606,"adTrack":null,"follow":{"itemType":"author","itemId":174,"followed":false},"shield":{"itemType":"author","itemId":174,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true},"cover":{"feed":"http://img.kaiyanapp.com/afb3e8b440a7dac3a723a993d9ea3831.png?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/afb3e8b440a7dac3a723a993d9ea3831.png?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/ddf7649b7c6f6d9ac6445e4349bf60db.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":null},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49184&editionType=default&source=qcloud","thumbPlayUrl":null,"duration":183,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=49184","forWeibo":"http://wandou.im/3oa77d"},"releaseTime":1504759097000,"library":"DEFAULT","playInfo":[{"height":480,"width":854,"urlList":[{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49184&editionType=normal&source=qcloud","size":14381674},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49184&editionType=normal&source=ucloud","size":14381674}],"name":"标清","type":"normal","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49184&editionType=normal&source=qcloud"},{"height":720,"width":1280,"urlList":[{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49184&editionType=high&source=qcloud","size":24892967},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49184&editionType=high&source=ucloud","size":24892967}],"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49184&editionType=high&source=qcloud"}],"consumption":{"collectionCount":9,"shareCount":0,"replyCount":0},"campaign":null,"waterMarks":null,"adTrack":null,"tags":[],"type":"NORMAL","titlePgc":"五花肉配卷心菜，这煎饼很厉害！","descriptionPgc":"人见人爱的煎饼果子，现在流行加各种料，榨菜、肉松、火腿肠，想加什么加什么。在日本关西一带，有一种煎饼也是这样，它叫大阪烧（Okonomiyaki），原本的意思就是\u201c想加什么就加什么煎饼\u201d.","remark":"","idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1504759097000,"promotion":null,"label":null,"labelList":[],"descriptionEditor":"","collected":false,"played":false,"subtitles":[],"lastViewTime":null,"playlists":null},"tag":null},{"type":"video","data":{"dataType":"VideoBeanForClient","id":49166,"title":"让人眼花缭乱的板栗甜点","slogan":null,"description":"精致可口。","provider":{"name":"定制来源","alias":"CustomSrc","icon":""},"category":"开胃","author":{"id":1562,"icon":"http://img.kaiyanapp.com/e318b9603625dd3b921fb55f77bde7e8.jpeg?imageMogr2/quality/60/format/jpg","name":"Tastemade日本版","description":"分享日本料理家们的美食创作。","link":"","latestReleaseTime":1504757388000,"videoNum":55,"adTrack":null,"follow":{"itemType":"author","itemId":1562,"followed":false},"shield":{"itemType":"author","itemId":1562,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true},"cover":{"feed":"http://img.kaiyanapp.com/bb4ef355df2286b5ccccaadc94312790.jpeg?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/bb4ef355df2286b5ccccaadc94312790.jpeg?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/72c3b73f2f39db48265931bdca190f05.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":null},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49166&editionType=default&source=qcloud","thumbPlayUrl":null,"duration":51,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=49166","forWeibo":"http://wandou.im/3oa72g"},"releaseTime":1504757388000,"library":"DEFAULT","playInfo":[{"height":480,"width":854,"urlList":[{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49166&editionType=normal&source=qcloud","size":5453170},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49166&editionType=normal&source=ucloud","size":5453170}],"name":"标清","type":"normal","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49166&editionType=normal&source=qcloud"},{"height":720,"width":1280,"urlList":[{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49166&editionType=high&source=qcloud","size":9264520},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49166&editionType=high&source=ucloud","size":9264520}],"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49166&editionType=high&source=qcloud"}],"consumption":{"collectionCount":2,"shareCount":0,"replyCount":0},"campaign":null,"waterMarks":null,"adTrack":null,"tags":[],"type":"NORMAL","titlePgc":"让人眼花缭乱的板栗甜点","descriptionPgc":"精致可口。","remark":null,"idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1504757388000,"promotion":null,"label":null,"labelList":[],"descriptionEditor":"","collected":false,"played":false,"subtitles":[],"lastViewTime":null,"playlists":null},"tag":null},{"type":"video","data":{"dataType":"VideoBeanForClient","id":20098,"title":"教你自制五款味道秒杀喜茶的饮品","slogan":null,"description":"虽然我只教了你做下面五款茶，但事实上，我教了你煮糖浆、打奶盖，你完全可以在我的这个基础上，做成30个口味的茶。 只需十五分钟你就能做出一家几口人都能喝的茶。还能一个月选择每天不同口味.","provider":{"name":"PGC","alias":"PGC","icon":""},"category":"开胃","author":{"id":704,"icon":"http://img.kaiyanapp.com/320ec4f272e8bd66dcdbdd6307819f50.png?imageMogr2/quality/60/format/jpg","name":"仓之食","description":"用心的儿童美食＼亲子互动视频，分享迷你仓小朋友和羊子妈妈的生活小点滴。无论科技怎样发展，让孩子茁壮成长的核心要素是很基本的。重视家庭教育的重要性，和孩子一起度过充满爱的时间吧。","link":"","latestReleaseTime":1503630030000,"videoNum":28,"adTrack":null,"follow":{"itemType":"author","itemId":704,"followed":false},"shield":{"itemType":"author","itemId":704,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true},"cover":{"feed":"http://img.kaiyanapp.com/69298e19f0b187e9b33d867522ef21e4.png?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/69298e19f0b187e9b33d867522ef21e4.png?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/b98b75e6e728321ed6b000487a619cea.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":null},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=20098&editionType=default&source=qcloud","thumbPlayUrl":null,"duration":290,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=20098","forWeibo":"http://wandou.im/3mzc3w"},"releaseTime":1493279074000,"library":"DEFAULT","playInfo":[{"height":480,"width":854,"urlList":[{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=20098&editionType=normal&source=qcloud","size":20407278},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=20098&editionType=normal&source=ucloud","size":20407278}],"name":"标清","type":"normal","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=20098&editionType=normal&source=qcloud"},{"height":720,"width":1280,"urlList":[{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=20098&editionType=high&source=qcloud","size":33670689},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=20098&editionType=high&source=ucloud","size":33670689}],"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=20098&editionType=high&source=qcloud"}],"consumption":{"collectionCount":4265,"shareCount":1149,"replyCount":16},"campaign":null,"waterMarks":null,"adTrack":null,"tags":[],"type":"NORMAL","titlePgc":"教你自制五款味道秒杀喜茶的饮品","descriptionPgc":"虽然我只教了你做下面五款茶，但事实上，我教了你煮糖浆、打奶盖，你完全可以在我的这个基础上，做成30个口味的茶。 只需十五分钟你就能做出一家几口人都能喝的茶。还能一个月选择每天不同口味.","remark":"","idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1493279074000,"promotion":null,"label":null,"labelList":[],"descriptionEditor":"","collected":false,"played":false,"subtitles":[],"lastViewTime":null,"playlists":null},"tag":null}],"count":5,"adTrack":null},"tag":null},{"type":"videoCollectionOfHorizontalScrollCard","data":{"dataType":"ItemCollection","header":{"id":2,"title":"创意","font":"normal","cover":null,"label":null,"actionUrl":"eyepetizer://category/2/?title=%E5%88%9B%E6%84%8F","labelList":null,"subTitle":"技术与审美结合，探索视觉的无限可能","follow":{"itemType":"category","itemId":2,"followed":false}},"itemList":[{"type":"video","data":{"dataType":"VideoBeanForClient","id":49191,"title":"惠州版假人游戏","slogan":null,"description":"这一刻，世界静止","provider":{"name":"PGC","alias":"PGC","icon":""},"category":"创意","author":{"id":1730,"icon":"http://img.kaiyanapp.com/12034b40138bb5c5c4ab04c244b6faad.png?imageMogr2/quality/60/format/jpg","name":"PooR GuY","description":"视频传媒从业者。摄影职位，喜欢创新。","link":"","latestReleaseTime":1504760090000,"videoNum":3,"adTrack":null,"follow":{"itemType":"author","itemId":1730,"followed":false},"shield":{"itemType":"author","itemId":1730,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true},"cover":{"feed":"http://img.kaiyanapp.com/9c73a557b4766cfcd1aa6d8bbd2949f9.png?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/9c73a557b4766cfcd1aa6d8bbd2949f9.png?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/7fd42c84b223ebf8cd6aa52d34a965e4.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":null},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49191&editionType=default&source=qcloud","thumbPlayUrl":null,"duration":85,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=49191","forWeibo":"http://wandou.im/3oa7aa"},"releaseTime":1504760090000,"library":"DEFAULT","playInfo":[{"height":480,"width":854,"urlList":[{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49191&editionType=normal&source=qcloud","size":8049391},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49191&editionType=normal&source=ucloud","size":8049391}],"name":"标清","type":"normal","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49191&editionType=normal&source=qcloud"},{"height":720,"width":1280,"urlList":[{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49191&editionType=high&source=qcloud","size":13014945},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49191&editionType=high&source=ucloud","size":13014945}],"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49191&editionType=high&source=qcloud"}],"consumption":{"collectionCount":2,"shareCount":0,"replyCount":1},"campaign":null,"waterMarks":null,"adTrack":null,"tags":[],"type":"NORMAL","titlePgc":"惠州版假人游戏","descriptionPgc":"这一刻，世界静止","remark":"模范吴亦凡假人挑战。","idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1504760090000,"promotion":null,"label":null,"labelList":[],"descriptionEditor":"","collected":false,"played":false,"subtitles":[],"lastViewTime":null,"playlists":null},"tag":null},{"type":"video","data":{"dataType":"VideoBeanForClient","id":49077,"title":"每个姑娘心中都有自己的花样年华","slogan":null,"description":"#新鲜少女馆# SN16每个姑娘心中都有自己的花样年华 如果，你有多一张船票， 会不会带我走。 本期研究对象：@印梦珂Beryl 导演：@王爷今天活着呢么 关注@少女日常研究所，发现少女之美","provider":{"name":"PGC","alias":"PGC","icon":""},"category":"创意","author":{"id":1220,"icon":"http://img.kaiyanapp.com/a4c943758c235b1054b3b7569c8381e8.png?imageMogr2/quality/60/format/jpg","name":"少女日常研究所","description":"微博@少女日常研究所 MissQ校花旗下精致短视频栏目。 ","link":"","latestReleaseTime":1504696331000,"videoNum":25,"adTrack":null,"follow":{"itemType":"author","itemId":1220,"followed":false},"shield":{"itemType":"author","itemId":1220,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true},"cover":{"feed":"http://img.kaiyanapp.com/6d4c401e62fb23b628a5432e8c34df62.png?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/6d4c401e62fb23b628a5432e8c34df62.png?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/663a44d3123b8ffffdacca619009bdf8.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":null},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49077&editionType=default&source=qcloud","thumbPlayUrl":null,"duration":125,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=49077","forWeibo":"http://wandou.im/3oa40g"},"releaseTime":1504696331000,"library":"DEFAULT","playInfo":[{"height":480,"width":854,"urlList":[{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49077&editionType=normal&source=qcloud","size":8638177},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49077&editionType=normal&source=ucloud","size":8638177}],"name":"标清","type":"normal","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49077&editionType=normal&source=qcloud"},{"height":720,"width":1280,"urlList":[{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49077&editionType=high&source=qcloud","size":14240643},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49077&editionType=high&source=ucloud","size":14240643}],"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49077&editionType=high&source=qcloud"}],"consumption":{"collectionCount":38,"shareCount":13,"replyCount":2},"campaign":null,"waterMarks":null,"adTrack":null,"tags":[],"type":"NORMAL","titlePgc":"每个姑娘心中都有自己的花样年华","descriptionPgc":"#新鲜少女馆# SN16每个姑娘心中都有自己的花样年华 如果，你有多一张船票， 会不会带我走。 本期研究对象：@印梦珂Beryl 导演：@王爷今天活着呢么 关注@少女日常研究所，发现少女之美","remark":"","idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1504696331000,"promotion":null,"label":null,"labelList":[],"descriptionEditor":"","collected":false,"played":false,"subtitles":[],"lastViewTime":null,"playlists":null},"tag":null},{"type":"video","data":{"dataType":"VideoBeanForClient","id":49051,"title":"黑暗之光 | 唯美视效短片","slogan":null,"description":"School: SCADDirected by: Eli Guillou Written by: Hannah Maschoff ","provider":{"name":"PGC","alias":"PGC","icon":""},"category":"创意","author":{"id":1165,"icon":"http://img.kaiyanapp.com/218e1004be702adf0b4b51fe49af2804.png?imageMogr2/quality/60/format/jpg","name":"动效广告精选","description":"公众号：营创实验室，专注分享优秀的视觉动效作品","link":"","latestReleaseTime":1504693496000,"videoNum":22,"adTrack":null,"follow":{"itemType":"author","itemId":1165,"followed":false},"shield":{"itemType":"author","itemId":1165,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true},"cover":{"feed":"http://img.kaiyanapp.com/53d46bcea45e7f29abb058cd03a3fc1b.png?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/53d46bcea45e7f29abb058cd03a3fc1b.png?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/1cb5ac96d8792debe2f2c232e6c53daf.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":null},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49051&editionType=default&source=qcloud","thumbPlayUrl":null,"duration":126,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=49051","forWeibo":"http://wandou.im/3oa3qa"},"releaseTime":1504693496000,"library":"DEFAULT","playInfo":[{"height":480,"width":854,"urlList":[{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49051&editionType=normal&source=qcloud","size":4542397},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49051&editionType=normal&source=ucloud","size":4542397}],"name":"标清","type":"normal","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49051&editionType=normal&source=qcloud"},{"height":720,"width":1280,"urlList":[{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49051&editionType=high&source=qcloud","size":6699529},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49051&editionType=high&source=ucloud","size":6699529}],"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49051&editionType=high&source=qcloud"}],"consumption":{"collectionCount":111,"shareCount":29,"replyCount":0},"campaign":null,"waterMarks":null,"adTrack":null,"tags":[],"type":"NORMAL","titlePgc":"黑暗之光 | 唯美视效短片","descriptionPgc":"School: SCADDirected by: Eli Guillou Written by: Hannah Maschoff ","remark":"","idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1504693496000,"promotion":null,"label":null,"labelList":[],"descriptionEditor":"","collected":false,"played":false,"subtitles":[],"lastViewTime":null,"playlists":null},"tag":null},{"type":"video","data":{"dataType":"VideoBeanForClient","id":48951,"title":"她用孤独拯救了23只小怪兽","slogan":null,"description":"Echo用烤鸡腿的烤箱，创造出了23个小怪物和一个成人的童话世界。在她的世界里，花花草草染了人的气息，便有了感情，会呼吸，会欢笑，会耳语。","provider":{"name":"PGC","alias":"PGC","icon":""},"category":"创意","author":{"id":1289,"icon":"http://img.kaiyanapp.com/4298be6684bd3b6f5c6de6bd54c656f4.png?imageMogr2/quality/60/format/jpg","name":"开吉录像厅","description":"\u201c开吉录像厅\u201d是一个原创视频品牌。我们「在纪录」年青的生活态度和艺术想法。和录像带里的他们一样，我们都在生活的扑腾中学着向世界发出自己的声音，我们毕竟年轻又迷人 | Catchy ","link":"","latestReleaseTime":1504689197000,"videoNum":21,"adTrack":null,"follow":{"itemType":"author","itemId":1289,"followed":false},"shield":{"itemType":"author","itemId":1289,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true},"cover":{"feed":"http://img.kaiyanapp.com/36593bf3c429782f3c1641d9b6563936.png?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/36593bf3c429782f3c1641d9b6563936.png?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/9f8e502b5334ef5269f7f5cdfa8e4c51.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":null},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=48951&editionType=default&source=qcloud","thumbPlayUrl":null,"duration":246,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=48951","forWeibo":"http://wandou.im/3oa3ap"},"releaseTime":1504689197000,"library":"DEFAULT","playInfo":[{"height":480,"width":854,"urlList":[{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=48951&editionType=normal&source=qcloud","size":19620356},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=48951&editionType=normal&source=ucloud","size":19620356}],"name":"标清","type":"normal","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=48951&editionType=normal&source=qcloud"},{"height":720,"width":1280,"urlList":[{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=48951&editionType=high&source=qcloud","size":33777659},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=48951&editionType=high&source=ucloud","size":33777659}],"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=48951&editionType=high&source=qcloud"}],"consumption":{"collectionCount":24,"shareCount":4,"replyCount":0},"campaign":null,"waterMarks":null,"adTrack":null,"tags":[],"type":"NORMAL","titlePgc":"她用孤独拯救了23只小怪兽","descriptionPgc":"Echo用烤鸡腿的烤箱，创造出了23个小怪物和一个成人的童话世界。在她的世界里，花花草草染了人的气息，便有了感情，会呼吸，会欢笑，会耳语。","remark":"Echo用烤鸡腿的烤箱，创造出了23个小怪物和一个成人的童话世界。在她的世界里，花花草草染了人的气息，便有了感情，会呼吸，会欢笑，会耳语。","idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1504689197000,"promotion":null,"label":null,"labelList":[],"descriptionEditor":"","collected":false,"played":false,"subtitles":[],"lastViewTime":null,"playlists":null},"tag":null},{"type":"video","data":{"dataType":"VideoBeanForClient","id":8076,"title":"一支笔点亮一座城市","slogan":null,"description":"日本电力公司 Kandenko 拍摄的广告片「Future with bright lights」，用一只高导电性银墨笔模拟了电力点亮城市的过程，画面中逐渐成型的微型城市，透露出理科生的小浪漫。BGM 来自歌手 YeYe。From (株)関電工","provider":{"name":"YouTube","alias":"youtube","icon":"http://img.kaiyanapp.com/fa20228bc5b921e837156923a58713f6.png"},"category":"创意","author":null,"cover":{"feed":"http://img.kaiyanapp.com/0bc1dc78c631eae017ee69418303adc5.jpeg?imageMogr2/quality/100","detail":"http://img.kaiyanapp.com/0bc1dc78c631eae017ee69418303adc5.jpeg?imageMogr2/quality/100","blurred":"http://img.kaiyanapp.com/d6a7b70cd65e5676749bb87e0251bb65.jpeg?imageMogr2/quality/100","sharing":null,"homepage":null},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=8076&editionType=default&source=qcloud","thumbPlayUrl":null,"duration":111,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=8076","forWeibo":"http://wandou.im/2jgcmv"},"releaseTime":1468166400000,"library":"DAILY","playInfo":[{"height":480,"width":854,"urlList":[{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=8076&editionType=normal&source=qcloud","size":7412287},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=8076&editionType=normal&source=ucloud","size":7412287}],"name":"标清","type":"normal","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=8076&editionType=normal&source=qcloud"},{"height":720,"width":1280,"urlList":[{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=8076&editionType=high&source=qcloud","size":15286472},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=8076&editionType=high&source=ucloud","size":15286472}],"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=8076&editionType=high&source=qcloud"}],"consumption":{"collectionCount":17173,"shareCount":19743,"replyCount":138},"campaign":null,"waterMarks":null,"adTrack":null,"tags":[{"id":2,"name":"创意","actionUrl":"eyepetizer://tag/2/?title=%E5%88%9B%E6%84%8F","adTrack":null},{"id":16,"name":"广告","actionUrl":"eyepetizer://tag/16/?title=%E5%B9%BF%E5%91%8A","adTrack":null},{"id":556,"name":"科技","actionUrl":"eyepetizer://tag/556/?title=%E7%A7%91%E6%8A%80","adTrack":null},{"id":136,"name":"温情","actionUrl":"eyepetizer://tag/136/?title=%E6%B8%A9%E6%83%85","adTrack":null}],"type":"NORMAL","titlePgc":null,"descriptionPgc":null,"remark":null,"idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1468166400000,"promotion":null,"label":null,"labelList":[],"descriptionEditor":"日本电力公司 Kandenko 拍摄的广告片「Future with bright lights」，用一只高导电性银墨笔模拟了电力点亮城市的过程，画面中逐渐成型的微型城市，透露出理科生的小浪漫。BGM 来自歌手 YeYe。From (株)関電工","collected":false,"played":false,"subtitles":[],"lastViewTime":null,"playlists":null},"tag":null}],"count":5,"adTrack":null},"tag":null},{"type":"videoCollectionOfHorizontalScrollCard","data":{"dataType":"ItemCollection","header":{"id":22,"title":"记录","font":"normal","cover":null,"label":null,"actionUrl":"eyepetizer://category/22/?title=%E8%AE%B0%E5%BD%95","labelList":null,"subTitle":"告诉他们为什么与众不同","follow":{"itemType":"category","itemId":22,"followed":false}},"itemList":[{"type":"video","data":{"dataType":"VideoBeanForClient","id":49190,"title":"谁是赵少若？","slogan":null,"description":"他因孤独从而质疑这个被定义后的外在物质世界，渴望以独特的个体去感知和理解属于他自己的内在精神世界。自我意识对于艺术家尤为珍贵，因唯此才会独立思考，才会有人格独立与精神独立，而这些是当代艺术的重要标志。","provider":{"name":"PGC","alias":"PGC","icon":""},"category":"记录","author":{"id":1472,"icon":"http://img.kaiyanapp.com/27f4a486daf310c88d4ffd50ad0e5f96.png?imageMogr2/quality/60/format/jpg","name":"概艺网","description":"发现艺术背后的故事，浏览艺术家视频传记！","link":"","latestReleaseTime":1504760046000,"videoNum":46,"adTrack":null,"follow":{"itemType":"author","itemId":1472,"followed":false},"shield":{"itemType":"author","itemId":1472,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true},"cover":{"feed":"http://img.kaiyanapp.com/deabcd5080570e27a19130b62830aeb9.png?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/deabcd5080570e27a19130b62830aeb9.png?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/6dc565a06e6923a51c6f10c890ee34fc.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":null},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49190&editionType=default&source=qcloud","thumbPlayUrl":null,"duration":324,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=49190","forWeibo":"http://wandou.im/3oa7a3"},"releaseTime":1504760046000,"library":"DEFAULT","playInfo":[{"height":480,"width":854,"urlList":[{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49190&editionType=normal&source=qcloud","size":19293933},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49190&editionType=normal&source=ucloud","size":19293933}],"name":"标清","type":"normal","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49190&editionType=normal&source=qcloud"},{"height":720,"width":1280,"urlList":[{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49190&editionType=high&source=qcloud","size":31137630},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49190&editionType=high&source=ucloud","size":31137630}],"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49190&editionType=high&source=qcloud"}],"consumption":{"collectionCount":0,"shareCount":0,"replyCount":0},"campaign":null,"waterMarks":null,"adTrack":null,"tags":[],"type":"NORMAL","titlePgc":"谁是赵少若？","descriptionPgc":"他因孤独从而质疑这个被定义后的外在物质世界，渴望以独特的个体去感知和理解属于他自己的内在精神世界。自我意识对于艺术家尤为珍贵，因唯此才会独立思考，才会有人格独立与精神独立，而这些是当代艺术的重要标志。","remark":"","idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1504760046000,"promotion":null,"label":null,"labelList":[],"descriptionEditor":"","collected":false,"played":false,"subtitles":[],"lastViewTime":null,"playlists":null},"tag":null},{"type":"video","data":{"dataType":"VideoBeanForClient","id":49085,"title":"每只流浪猫狗都有一个故事，请拒绝购买","slogan":null,"description":"中国平均每年有流浪狗4000万只，他们大都是流浪走失被遗弃甚至被屠宰。每天不计其数的狗狗被运输到全国成为盘中餐，心痛的是这因买卖造成的伤害却仍在蔓延。领养可以改变流浪猫狗的悲惨命运，请支持领养代替购买","provider":{"name":"PGC","alias":"PGC","icon":""},"category":"记录","author":{"id":1815,"icon":"http://img.kaiyanapp.com/6984e4812c25960f4f8d32b9e23a54f9.png?imageMogr2/quality/60/format/jpg","name":"夏梦怡Grace","description":"微博@Grace夏梦怡 90后青年导演 代表作故事短片《离城》 纪录片《隐居中国》《远去的家》《我的第一位》《Grace的奥斯陆游记》","link":"","latestReleaseTime":null,"videoNum":1,"adTrack":null,"follow":{"itemType":"author","itemId":1815,"followed":false},"shield":{"itemType":"author","itemId":1815,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true},"cover":{"feed":"http://img.kaiyanapp.com/aca87e7d73e9960039868453461ab3f1.png?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/aca87e7d73e9960039868453461ab3f1.png?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/5eca161aca7c84f5bbd09d6532172af3.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":null},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49085&editionType=default&source=qcloud","thumbPlayUrl":null,"duration":409,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=49085","forWeibo":"http://wandou.im/3oa6so"},"releaseTime":1504753821000,"library":"DEFAULT","playInfo":[{"height":480,"width":854,"urlList":[{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49085&editionType=normal&source=qcloud","size":44601383},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49085&editionType=normal&source=ucloud","size":44601383}],"name":"标清","type":"normal","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49085&editionType=normal&source=qcloud"},{"height":720,"width":1280,"urlList":[{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49085&editionType=high&source=qcloud","size":74784671},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49085&editionType=high&source=ucloud","size":74784671}],"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49085&editionType=high&source=qcloud"}],"consumption":{"collectionCount":0,"shareCount":4,"replyCount":1},"campaign":null,"waterMarks":null,"adTrack":null,"tags":[],"type":"NORMAL","titlePgc":"每只流浪猫狗都有一个故事，请拒绝购买","descriptionPgc":"中国平均每年有流浪狗4000万只，他们大都是流浪走失被遗弃甚至被屠宰。每天不计其数的狗狗被运输到全国成为盘中餐，心痛的是这因买卖造成的伤害却仍在蔓延。领养可以改变流浪猫狗的悲惨命运，请支持领养代替购买","remark":"","idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1504753821000,"promotion":null,"label":null,"labelList":[],"descriptionEditor":"","collected":false,"played":false,"subtitles":[],"lastViewTime":null,"playlists":null},"tag":null},{"type":"video","data":{"dataType":"VideoBeanForClient","id":49075,"title":"扭曲犹太人苏斯 用一部电影激起大屠杀","slogan":null,"description":"《犹太人苏斯》耗资200多万帝国马克，经历了一年多的制作过程。最后，在1940年的威尼斯电影节上，这部古装大片举行了首映。","provider":{"name":"PGC","alias":"PGC","icon":""},"category":"记录","author":{"id":1811,"icon":"http://img.kaiyanapp.com/8f5ddeb15157272edafeb97cc43e6099.png?imageMogr2/quality/60/format/jpg","name":"百姓读史","description":"关注中国历史、解读各类史记、探寻中国秘史","link":"","latestReleaseTime":1504696184000,"videoNum":1,"adTrack":null,"follow":{"itemType":"author","itemId":1811,"followed":false},"shield":{"itemType":"author","itemId":1811,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true},"cover":{"feed":"http://img.kaiyanapp.com/932819e1f9bd2eb4890945c3234ce7d5.png?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/932819e1f9bd2eb4890945c3234ce7d5.png?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/1667ff935ed848de85be6f38d830e4a3.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":null},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49075&editionType=default&source=qcloud","thumbPlayUrl":null,"duration":746,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=49075","forWeibo":"http://wandou.im/3oa3zv"},"releaseTime":1504696184000,"library":"DEFAULT","playInfo":[{"height":480,"width":854,"urlList":[{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49075&editionType=normal&source=qcloud","size":65047456},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49075&editionType=normal&source=ucloud","size":65047456}],"name":"标清","type":"normal","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49075&editionType=normal&source=qcloud"},{"height":720,"width":1280,"urlList":[{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49075&editionType=high&source=qcloud","size":115987131},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49075&editionType=high&source=ucloud","size":115987131}],"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=49075&editionType=high&source=qcloud"}],"consumption":{"collectionCount":15,"shareCount":0,"replyCount":0},"campaign":null,"waterMarks":null,"adTrack":null,"tags":[],"type":"NORMAL","titlePgc":"扭曲犹太人苏斯 用一部电影激起大屠杀","descriptionPgc":"《犹太人苏斯》耗资200多万帝国马克，经历了一年多的制作过程。最后，在1940年的威尼斯电影节上，这部古装大片举行了首映。","remark":"","idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1504696184000,"promotion":null,"label":null,"labelList":[],"descriptionEditor":"","collected":false,"played":false,"subtitles":[],"lastViewTime":null,"playlists":null},"tag":null},{"type":"video","data":{"dataType":"VideoBeanForClient","id":48968,"title":"战斗机全景追逐跟拍超级日全食","slogan":null,"description":"8月21日，美国迎百年一遇\u201c超级日全食\u201d，摄影师乘坐战斗机跟拍日全食，使用Insta360 ONE全景相机记录下追逐日食的全过程。","provider":{"name":"PGC","alias":"PGC","icon":""},"category":"记录","author":{"id":1767,"icon":"http://img.kaiyanapp.com/76ff4e6f9a293f49c068cd080339b872.png?imageMogr2/quality/60/format/jpg","name":"Insta360 VR全景相机","description":"Insta360 全景相机，玩转最酷炫全景。","link":"","latestReleaseTime":1504691905000,"videoNum":3,"adTrack":null,"follow":{"itemType":"author","itemId":1767,"followed":false},"shield":{"itemType":"author","itemId":1767,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true},"cover":{"feed":"http://img.kaiyanapp.com/8c720faba88a5b879f1ef1b5e8f4f6ea.png?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/8c720faba88a5b879f1ef1b5e8f4f6ea.png?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/26e7ccb25297d66921147547b95f20c9.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":null},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=48968&editionType=default&source=qcloud","thumbPlayUrl":null,"duration":82,"webUrl":{"raw":"http://www.eyepetizer.net/panorama_detail.html?vid=48968","forWeibo":"http://wandou.im/3oa3iz"},"releaseTime":1504691905000,"library":"DEFAULT","playInfo":[{"height":720,"width":1440,"urlList":[{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=48968&editionType=normal&source=qcloud","size":17610360},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=48968&editionType=normal&source=ucloud","size":17610360}],"name":"标清","type":"normal","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=48968&editionType=normal&source=qcloud"},{"height":1080,"width":2160,"urlList":[{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=48968&editionType=high&source=qcloud","size":34574236},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=48968&editionType=high&source=ucloud","size":34574236}],"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=48968&editionType=high&source=qcloud"}],"consumption":{"collectionCount":2,"shareCount":2,"replyCount":0},"campaign":null,"waterMarks":null,"adTrack":null,"tags":[{"id":658,"name":"360°全景","actionUrl":"eyepetizer://tag/658/?title=360%C2%B0%E5%85%A8%E6%99%AF","adTrack":null}],"type":"PANORAMIC","titlePgc":"战斗机全景追逐跟拍超级日全食","descriptionPgc":"8月21日，美国迎百年一遇\u201c超级日全食\u201d，摄影师乘坐战斗机跟拍日全食，使用Insta360 ONE全景相机记录下追逐日食的全过程。","remark":"战斗机拍日食，下一次是7年后！","idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1504691905000,"promotion":null,"label":{"text":"360°全景","card":"360°全景","detail":"360°全景"},"labelList":[{"text":"360°全景","actionUrl":null}],"descriptionEditor":"","collected":false,"played":false,"subtitles":[],"lastViewTime":null,"playlists":null},"tag":null},{"type":"video","data":{"dataType":"VideoBeanForClient","id":5538,"title":"什么阻止了你实现目标？","slogan":null,"description":"是什么让你没能成为自己希望的那个样子呢？是因为经济或者时间的束缚？还是因为身体的力不从心，或是缺乏支持的资源？短片采访了六位决心突破自己的人，看一看到底是什么阻止着我们去实现目标。From SoulPancake","provider":{"name":"YouTube","alias":"youtube","icon":"http://img.kaiyanapp.com/fa20228bc5b921e837156923a58713f6.png"},"category":"记录","author":null,"cover":{"feed":"http://img.kaiyanapp.com/3250d1462f79d01aec670cdea9d600d7.jpeg?imageMogr2/quality/100","detail":"http://img.kaiyanapp.com/3250d1462f79d01aec670cdea9d600d7.jpeg?imageMogr2/quality/100","blurred":"http://img.kaiyanapp.com/bc00c7d43caa0757fead069d7fcca144.jpeg?imageMogr2/quality/100","sharing":null,"homepage":null},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=5538&editionType=default&source=qcloud","thumbPlayUrl":null,"duration":165,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=5538","forWeibo":"http://wandou.im/1ic271"},"releaseTime":1457280000000,"library":"DAILY","playInfo":[{"height":480,"width":854,"urlList":[{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=5538&editionType=normal&source=qcloud","size":18226017},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=5538&editionType=normal&source=ucloud","size":18226017}],"name":"标清","type":"normal","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=5538&editionType=normal&source=qcloud"},{"height":720,"width":1280,"urlList":[{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=5538&editionType=high&source=qcloud","size":23533608},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=5538&editionType=high&source=ucloud","size":23533608}],"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=5538&editionType=high&source=qcloud"}],"consumption":{"collectionCount":18269,"shareCount":17819,"replyCount":142},"campaign":null,"waterMarks":null,"adTrack":null,"tags":[{"id":510,"name":"励志","actionUrl":"eyepetizer://tag/510/?title=%E5%8A%B1%E5%BF%97","adTrack":null},{"id":530,"name":"人生","actionUrl":"eyepetizer://tag/530/?title=%E4%BA%BA%E7%94%9F","adTrack":null},{"id":24,"name":"记录","actionUrl":"eyepetizer://tag/24/?title=%E8%AE%B0%E5%BD%95","adTrack":null}],"type":"NORMAL","titlePgc":null,"descriptionPgc":null,"remark":null,"idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1457280000000,"promotion":null,"label":null,"labelList":[],"descriptionEditor":"是什么让你没能成为自己希望的那个样子呢？是因为经济或者时间的束缚？还是因为身体的力不从心，或是缺乏支持的资源？短片采访了六位决心突破自己的人，看一看到底是什么阻止着我们去实现目标。From SoulPancake","collected":false,"played":false,"subtitles":[],"lastViewTime":null,"playlists":null},"tag":null}],"count":5,"adTrack":null},"tag":null}]
     * count : 6
     * total : 0
     * nextPageUrl : http://baobab.kaiyanapp.com/api/v4/discovery/category?start=4&num=4
     */



    private int count;
    private int total;
    private String nextPageUrl;
    private List<ItemListBeanX> itemList;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getNextPageUrl() {
        return nextPageUrl;
    }

    public void setNextPageUrl(String nextPageUrl) {
        this.nextPageUrl = nextPageUrl;
    }

    public List<ItemListBeanX> getItemList() {
        return itemList;
    }

    public void setItemList(List<ItemListBeanX> itemList) {
        this.itemList = itemList;
    }

    public static class ItemListBeanX {
        @Override
        public String toString() {
            return "ItemListBeanX{" +
                    "type='" + type + '\'' +
                    ", data=" + data +
                    ", tag=" + tag +
                    '}';
        }

        /**
         * type : squareCardCollection
         * data : {"dataType":"ItemCollection","header":{"id":1,"title":"热门分类","font":"bold","cover":null,"label":null,"actionUrl":"eyepetizer://categories/all","labelList":null},"itemList":[{"type":"squareCard","data":{"dataType":"SquareCard","id":2,"title":"#创意","image":"http://img.kaiyanapp.com/f4a9aba1c6857ee0cefcdc5aee0a1fc9.png?imageMogr2/quality/60/format/jpg","actionUrl":"eyepetizer://category/2/?title=%E5%88%9B%E6%84%8F","shade":true,"adTrack":null},"tag":null},{"type":"squareCard","data":{"dataType":"SquareCard","id":18,"title":"#运动","image":"http://img.kaiyanapp.com/c746d56db089909b1cdd933fa7c98ef8.jpeg","actionUrl":"eyepetizer://category/18/?title=%E8%BF%90%E5%8A%A8","shade":true,"adTrack":null},"tag":null},{"type":"squareCard","data":{"dataType":"SquareCard","id":20,"title":"#音乐","image":"http://img.kaiyanapp.com/9279c17b4da5ba5e7e4f21afb5bb0a74.jpeg","actionUrl":"eyepetizer://category/20/?title=%E9%9F%B3%E4%B9%90","shade":true,"adTrack":null},"tag":null},{"type":"squareCard","data":{"dataType":"SquareCard","id":4,"title":"#开胃","image":"http://img.kaiyanapp.com/5817f1bfdce61130204a24268160b619.jpeg","actionUrl":"eyepetizer://category/4/?title=%E5%BC%80%E8%83%83","shade":true,"adTrack":null},"tag":null},{"type":"squareCard","data":{"dataType":"SquareCard","id":22,"title":"#记录","image":"http://img.kaiyanapp.com/a2fc6d32ac0b4f2842fb3d545d06f09b.jpeg","actionUrl":"eyepetizer://category/22/?title=%E8%AE%B0%E5%BD%95","shade":true,"adTrack":null},"tag":null},{"type":"actionCard","data":{"dataType":"ActionCard","id":0,"text":"查看全部","actionUrl":"eyepetizer://categories/all","adTrack":null},"tag":null}],"count":6,"adTrack":null}
         * tag : null
         */

        private String type;
        private DataBeanX data;
        private Object tag;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public DataBeanX getData() {
            return data;
        }

        public void setData(DataBeanX data) {
            this.data = data;
        }

        public Object getTag() {
            return tag;
        }

        public void setTag(Object tag) {
            this.tag = tag;
        }

        public static class DataBeanX {
            @Override
            public String toString() {
                return "DataBeanX{" +
                        "dataType='" + dataType + '\'' +
                        ", header=" + header +
                        ", count=" + count +
                        ", adTrack=" + adTrack +
                        ", itemList=" + itemList +
                        '}';
            }

            /**
             * dataType : ItemCollection
             * header : {"id":1,"title":"热门分类","font":"bold","cover":null,"label":null,"actionUrl":"eyepetizer://categories/all","labelList":null}
             * itemList : [{"type":"squareCard","data":{"dataType":"SquareCard","id":2,"title":"#创意","image":"http://img.kaiyanapp.com/f4a9aba1c6857ee0cefcdc5aee0a1fc9.png?imageMogr2/quality/60/format/jpg","actionUrl":"eyepetizer://category/2/?title=%E5%88%9B%E6%84%8F","shade":true,"adTrack":null},"tag":null},{"type":"squareCard","data":{"dataType":"SquareCard","id":18,"title":"#运动","image":"http://img.kaiyanapp.com/c746d56db089909b1cdd933fa7c98ef8.jpeg","actionUrl":"eyepetizer://category/18/?title=%E8%BF%90%E5%8A%A8","shade":true,"adTrack":null},"tag":null},{"type":"squareCard","data":{"dataType":"SquareCard","id":20,"title":"#音乐","image":"http://img.kaiyanapp.com/9279c17b4da5ba5e7e4f21afb5bb0a74.jpeg","actionUrl":"eyepetizer://category/20/?title=%E9%9F%B3%E4%B9%90","shade":true,"adTrack":null},"tag":null},{"type":"squareCard","data":{"dataType":"SquareCard","id":4,"title":"#开胃","image":"http://img.kaiyanapp.com/5817f1bfdce61130204a24268160b619.jpeg","actionUrl":"eyepetizer://category/4/?title=%E5%BC%80%E8%83%83","shade":true,"adTrack":null},"tag":null},{"type":"squareCard","data":{"dataType":"SquareCard","id":22,"title":"#记录","image":"http://img.kaiyanapp.com/a2fc6d32ac0b4f2842fb3d545d06f09b.jpeg","actionUrl":"eyepetizer://category/22/?title=%E8%AE%B0%E5%BD%95","shade":true,"adTrack":null},"tag":null},{"type":"actionCard","data":{"dataType":"ActionCard","id":0,"text":"查看全部","actionUrl":"eyepetizer://categories/all","adTrack":null},"tag":null}]
             * count : 6
             * adTrack : null
             */



            private String dataType;
            private HeaderBean header;
            private int count;
            private Object adTrack;
            private List<ItemListBean> itemList;

            public String getDataType() {
                return dataType;
            }

            public void setDataType(String dataType) {
                this.dataType = dataType;
            }

            public HeaderBean getHeader() {
                return header;
            }

            public void setHeader(HeaderBean header) {
                this.header = header;
            }

            public int getCount() {
                return count;
            }

            public void setCount(int count) {
                this.count = count;
            }

            public Object getAdTrack() {
                return adTrack;
            }

            public void setAdTrack(Object adTrack) {
                this.adTrack = adTrack;
            }

            public List<ItemListBean> getItemList() {
                return itemList;
            }

            public void setItemList(List<ItemListBean> itemList) {
                this.itemList = itemList;
            }

            public static class HeaderBean {
                @Override
                public String toString() {
                    return "HeaderBean{" +
                            "id=" + id +
                            ", title='" + title + '\'' +
                            ", font='" + font + '\'' +
                            ", cover=" + cover +
                            ", label=" + label +
                            ", actionUrl='" + actionUrl + '\'' +
                            ", labelList=" + labelList +
                            '}';
                }

                /**
                 * id : 1
                 * title : 热门分类
                 * font : bold
                 * cover : null
                 * label : null
                 * actionUrl : eyepetizer://categories/all
                 * labelList : null
                 */

                private int id;
                private String title;
                private String font;
                private Object cover;
                private Object label;
                private String actionUrl;
                private Object labelList;
                private String subTitle;

                public String getSubTitle() {
                    return subTitle;
                }

                public void setSubTitle(String subTitle) {
                    this.subTitle = subTitle;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getFont() {
                    return font;
                }

                public void setFont(String font) {
                    this.font = font;
                }

                public Object getCover() {
                    return cover;
                }

                public void setCover(Object cover) {
                    this.cover = cover;
                }

                public Object getLabel() {
                    return label;
                }

                public void setLabel(Object label) {
                    this.label = label;
                }

                public String getActionUrl() {
                    return actionUrl;
                }

                public void setActionUrl(String actionUrl) {
                    this.actionUrl = actionUrl;
                }

                public Object getLabelList() {
                    return labelList;
                }

                public void setLabelList(Object labelList) {
                    this.labelList = labelList;
                }
            }

            public static class ItemListBean {

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

                public static class DataBean {
                    @Override
                    public String toString() {
                        return "DataBean{" +
                                "dataType='" + dataType + '\'' +
                                ", id=" + id +
                                ", title='" + title + '\'' +
                                ", image='" + image + '\'' +
                                ", actionUrl='" + actionUrl + '\'' +
                                ", shade=" + shade +
                                ", adTrack=" + adTrack +
                                '}';
                    }

                    /**
                     * dataType : SquareCard
                     * id : 2
                     * title : #创意
                     * image : http://img.kaiyanapp.com/f4a9aba1c6857ee0cefcdc5aee0a1fc9.png?imageMogr2/quality/60/format/jpg
                     * actionUrl : eyepetizer://category/2/?title=%E5%88%9B%E6%84%8F
                     * shade : true
                     * adTrack : null
                     */

                    private String dataType;
                    private String id;
                    private String title;
                    private String image;
                    private String actionUrl;
                    private boolean shade;
                    private Object adTrack;
                    private String playUrl;

                    private String description;

                    public String getDescription() {
                        return description;
                    }

                    public void setDescription(String description) {
                        this.description = description;
                    }

                    public String getPlayUrl() {
                        return playUrl;
                    }

                    public void setPlayUrl(String playUrl) {
                        this.playUrl = playUrl;
                    }

                    private String category;

                    private CoverBean cover;

                    public CoverBean getCover() {
                        return cover;
                    }

                    public void setCover(CoverBean cover) {
                        this.cover = cover;
                    }

                    public static class CoverBean implements Serializable {
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

                    public String getCategory() {
                        return category;
                    }

                    public void setCategory(String category) {
                        this.category = category;
                    }

                    private String text;

                    public String getText() {
                        return text;
                    }

                    public void setText(String text) {
                        this.text = text;
                    }

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
