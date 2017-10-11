package com.gezi.writetoexcel;

/**
 * Created by dell on 2017/3/3.
 */

public class Entity<T> {
    /**
     * errno : 0
     * errmsg : 成功
     * data : {"banner":[{"pic_url":"http://img.haocaisong.cn/banner/2/28/22858.png","url":"http://shop.haocaisong.cn/article/detail.php?id=20","display_order":"0","title":"3月预存活动","id":"32"},{"pic_url":"http://img.haocaisong.cn/banner/2/28/22859.png","url":"http://shop.haocaisong.cn/article/detail.php?id=19","display_order":"1","title":"3月抽奖活动","id":"33"},{"pic_url":"http://img.haocaisong.cn/banner/2/21/22135.png","url":"http://shop.haocaisong.cn/shop/mall.php?cate1=2&cate2=201&cate3=&bid=143","display_order":"2","title":"好材塑铜线","id":"9"},{"pic_url":"http://img.haocaisong.cn/banner/2/21/22134.png","url":"http://shop.haocaisong.cn/shop/mall.php?cate1=5&cate2=502&cate3=&bid=143","display_order":"3","title":"新品促销","id":"10"},{"pic_url":"http://img.haocaisong.cn/banner/2/27/22737.png","url":"http://shop.haocaisong.cn/article/detail.php?id=5","display_order":"4","title":"北京配送政策","id":"11"}],"label":[{"url":"http://shop.haocaisong.cn/shop/mall.php","name":"正品低价","pic_url":"http://img.haocaisong.cn/app_icon/icon_home_zhengpin.png"},{"url":"http://shop.haocaisong.cn/shop/mall.php","name":"免费送货","pic_url":"http://img.haocaisong.cn/app_icon/icon_home_mianfei.png"},{"url":"http://shop.haocaisong.cn/shop/mall.php","name":"4小时达","pic_url":"http://img.haocaisong.cn/app_icon/icon_home_4hour.png"},{"url":"http://shop.haocaisong.cn/shop/mall.php","name":"售后保障","pic_url":"http://img.haocaisong.cn/app_icon/icon_home_shouhou.png"}]}
     */

    private int errno;
    private String errmsg;
    private T data;

    public int getErrno() {
        return errno;
    }

    public void setErrno(int errno) {
        this.errno = errno;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
