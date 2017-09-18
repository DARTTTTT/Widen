package com.wrg.widen.Content;

/**
 * Created by 翁 on 2017/8/28.
 */

public interface Api {

        String BAND_URL="http://baobab.kaiyanapp.com/api/v2/feed?&num=1";

        String ALIKE_URL="http://baobab.kaiyanapp.com/api/v4/video/related?id=%S";

        String CLASSIFY_URL="http://baobab.kaiyanapp.com/api/v4/discovery/category";

        String CLASSIFY_DETAIL_URL="http://baobab.kaiyanapp.com/api/v4/categories/detail/tab?id=%S";

        String CLASSIFY_DETAILMORE_URL="http://baobab.kaiyanapp.com/api/v4/categories/videoList?start=%S&num=20&strategy=date&id=2";

        String SEARCH_URL="http://baobab.kaiyanapp.com/api/v1/search?num=10&query=%S&start=10";
}
