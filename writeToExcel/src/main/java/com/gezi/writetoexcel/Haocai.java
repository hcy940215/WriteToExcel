package com.gezi.writetoexcel;

import java.util.List;

/**
 * Created by dell on 2017/10/11.
 */

public class Haocai {

        /**
         * list : [{"pid":11777,"tagimg_url":"","tagimg_isshow":false,"image":"http://img.haocaisong.cn/pic/2/2/20295.jpg?x-oss-process=image/resize,m_pad,h_200,w_200","brand_id":208,"brand":"其他","title":"PB管 (4分)","model_id":"","_model":"S3.2 dn20*2.3mm  4m/根","model":"","price":"0","sale_price":"30","unit":"根","url":"http://shop.haocaisong.cn/product/app_detail.php?pid=11777&city_id=101","sale_count":0,"sales_type":0,"m_name":[null]},{"pid":11779,"tagimg_url":"","tagimg_isshow":false,"image":"http://img.haocaisong.cn/pic/2/7/20783.jpg?x-oss-process=image/resize,m_pad,h_200,w_200","brand_id":101,"brand":"联塑","title":"PB直接 (4分)","model_id":"443","_model":"D20","model":"","price":"0","sale_price":"1.5","unit":"个","url":"http://shop.haocaisong.cn/product/app_detail.php?pid=11779&city_id=101","sale_count":0,"sales_type":0,"m_name":[null]},{"pid":12225,"tagimg_url":"","tagimg_isshow":false,"image":"http://img.haocaisong.cn/pic/1/83/18335.jpg?x-oss-process=image/resize,m_pad,h_200,w_200","brand_id":208,"brand":"其他","title":"PB内丝直接 (4分)","model_id":"443","_model":"D20","model":"","price":"0","sale_price":"5.9","unit":"个","url":"http://shop.haocaisong.cn/product/app_detail.php?pid=12225&city_id=101","sale_count":0,"sales_type":0,"m_name":[null]},{"pid":11778,"tagimg_url":"","tagimg_isshow":false,"image":"http://img.haocaisong.cn/pic/1/83/18357.jpg?x-oss-process=image/resize,m_pad,h_200,w_200","brand_id":101,"brand":"联塑","title":"PB90°等径弯头 (4分)","model_id":"443","_model":"D20","model":"","price":"0","sale_price":"1.8","unit":"个","url":"http://shop.haocaisong.cn/product/app_detail.php?pid=11778&city_id=101","sale_count":0,"sales_type":0,"m_name":[null]},{"pid":12124,"tagimg_url":"","tagimg_isshow":false,"image":"http://img.haocaisong.cn/pic/1/83/18331.jpg?x-oss-process=image/resize,m_pad,h_200,w_200","brand_id":208,"brand":"其他","title":"PB管45°等径弯头 (4分)","model_id":"443","_model":"D20","model":"","price":"0","sale_price":"1.8","unit":"个","url":"http://shop.haocaisong.cn/product/app_detail.php?pid=12124&city_id=101","sale_count":0,"sales_type":0,"m_name":[null]},{"pid":11996,"tagimg_url":"","tagimg_isshow":false,"image":"http://img.haocaisong.cn/pic/1/83/18365.jpg?x-oss-process=image/resize,m_pad,h_200,w_200","brand_id":208,"brand":"其他","title":"PB内丝弯头 (4分)","model_id":"443","_model":"D20*1/2","model":"","price":"0","sale_price":"6.5","unit":"个","url":"http://shop.haocaisong.cn/product/app_detail.php?pid=11996&city_id=101","sale_count":0,"sales_type":0,"m_name":[null]},{"pid":12019,"tagimg_url":"","tagimg_isshow":false,"image":"http://img.haocaisong.cn/pic/1/83/18344.jpg?x-oss-process=image/resize,m_pad,h_200,w_200","brand_id":208,"brand":"其他","title":"PB等径三通 (4分)","model_id":"443","_model":"D20","model":"","price":"0","sale_price":"2.5","unit":"个","url":"http://shop.haocaisong.cn/product/app_detail.php?pid=12019&city_id=101","sale_count":0,"sales_type":0,"m_name":[null]},{"pid":12284,"tagimg_url":"","tagimg_isshow":false,"image":"http://img.haocaisong.cn/pic/1/83/18360.jpg?x-oss-process=image/resize,m_pad,h_200,w_200","brand_id":208,"brand":"其他","title":"PB内丝三通 (4分)","model_id":"443","_model":"D20","model":"","price":"0","sale_price":"7.5","unit":"个","url":"http://shop.haocaisong.cn/product/app_detail.php?pid=12284&city_id=101","sale_count":0,"sales_type":0,"m_name":[null]},{"pid":12106,"tagimg_url":"","tagimg_isshow":false,"image":"http://img.haocaisong.cn/pic/2/7/20784.jpg?x-oss-process=image/resize,m_pad,h_200,w_200","brand_id":208,"brand":"其他","title":"PB过桥弯 (4分)","model_id":"443","_model":"D20","model":"","price":"0","sale_price":"3.7","unit":"个","url":"http://shop.haocaisong.cn/product/app_detail.php?pid=12106&city_id=101","sale_count":0,"sales_type":0,"m_name":[null]},{"pid":12123,"tagimg_url":"","tagimg_isshow":false,"image":"http://img.haocaisong.cn/pic/1/83/18342.jpg?x-oss-process=image/resize,m_pad,h_200,w_200","brand_id":208,"brand":"其他","title":"PB堵帽 (4分)","model_id":"443","_model":"D20","model":"","price":"0","sale_price":"0.7","unit":"个","url":"http://shop.haocaisong.cn/product/app_detail.php?pid=12123&city_id=101","sale_count":0,"sales_type":0,"m_name":[null]},{"pid":11466,"tagimg_url":"","tagimg_isshow":false,"image":"http://img.haocaisong.cn/pic/0/80/8000.jpg?x-oss-process=image/resize,m_pad,h_200,w_200","brand_id":208,"brand":"其他","title":"PB管 (6分)","model_id":"","_model":"S3.2 dn25*2.8mm  4m/根","model":"","price":"0","sale_price":"40","unit":"个","url":"http://shop.haocaisong.cn/product/app_detail.php?pid=11466&city_id=101","sale_count":0,"sales_type":0,"m_name":[null]},{"pid":11588,"tagimg_url":"","tagimg_isshow":false,"image":"http://img.haocaisong.cn/pic/1/83/18355.jpg?x-oss-process=image/resize,m_pad,h_200,w_200","brand_id":101,"brand":"联塑","title":"PB直接 (6分)","model_id":"444","_model":"D25","model":"","price":"0","sale_price":"1.8","unit":"个","url":"http://shop.haocaisong.cn/product/app_detail.php?pid=11588&city_id=101","sale_count":0,"sales_type":0,"m_name":[null]},{"pid":12522,"tagimg_url":"","tagimg_isshow":false,"image":"http://img.haocaisong.cn/pic/1/10/11038.jpg?x-oss-process=image/resize,m_pad,h_200,w_200","brand_id":208,"brand":"其他","title":"PB内丝直接 (6分)","model_id":"444","_model":"D25*3/4","model":"","price":"0","sale_price":"8","unit":"个","url":"http://shop.haocaisong.cn/product/app_detail.php?pid=12522&city_id=101","sale_count":0,"sales_type":0,"m_name":[null]},{"pid":12386,"tagimg_url":"","tagimg_isshow":false,"image":"http://img.haocaisong.cn/pic/1/83/18337.jpg?x-oss-process=image/resize,m_pad,h_200,w_200","brand_id":208,"brand":"其他","title":"PB异径直接 (6变4)","model_id":"443,444","_model":"D25-20","model":"","price":"0","sale_price":"2.3","unit":"个","url":"http://shop.haocaisong.cn/product/app_detail.php?pid=12386&city_id=101","sale_count":0,"sales_type":0,"m_name":[null,null]},{"pid":11467,"tagimg_url":"","tagimg_isshow":false,"image":"http://img.haocaisong.cn/pic/1/83/18370.jpg?x-oss-process=image/resize,m_pad,h_200,w_200","brand_id":101,"brand":"联塑","title":"PB90°等径弯头 (6分)","model_id":"444","_model":"D25","model":"","price":"0","sale_price":"2.3","unit":"个","url":"http://shop.haocaisong.cn/product/app_detail.php?pid=11467&city_id=101","sale_count":0,"sales_type":0,"m_name":[null]},{"pid":12125,"tagimg_url":"","tagimg_isshow":false,"image":"http://img.haocaisong.cn/pic/1/83/18349.jpg?x-oss-process=image/resize,m_pad,h_200,w_200","brand_id":208,"brand":"其他","title":"PB管45°等径弯头 (6分)","model_id":"444","_model":"D25","model":"","price":"0","sale_price":"2.3","unit":"个","url":"http://shop.haocaisong.cn/product/app_detail.php?pid=12125&city_id=101","sale_count":0,"sales_type":0,"m_name":[null]},{"pid":12288,"tagimg_url":"","tagimg_isshow":false,"image":"http://img.haocaisong.cn/pic/0/80/8014.jpg?x-oss-process=image/resize,m_pad,h_200,w_200","brand_id":208,"brand":"其他","title":"PB内丝弯头 (6分)","model_id":"444","_model":"D25","model":"","price":"0","sale_price":"9.2","unit":"个","url":"http://shop.haocaisong.cn/product/app_detail.php?pid=12288&city_id=101","sale_count":0,"sales_type":0,"m_name":[null]},{"pid":11469,"tagimg_url":"","tagimg_isshow":false,"image":"http://img.haocaisong.cn/pic/2/12/21209.jpg?x-oss-process=image/resize,m_pad,h_200,w_200","brand_id":208,"brand":"其他","title":"PB等径三通 (6分)","model_id":"444","_model":"D25","model":"","price":"0","sale_price":"3","unit":"个","url":"http://shop.haocaisong.cn/product/app_detail.php?pid=11469&city_id=101","sale_count":0,"sales_type":0,"m_name":[null]},{"pid":12121,"tagimg_url":"","tagimg_isshow":false,"image":"http://img.haocaisong.cn/pic/2/7/20788.jpg?x-oss-process=image/resize,m_pad,h_200,w_200","brand_id":208,"brand":"其他","title":"PB异径三通 (6变4)","model_id":"443,444","_model":"D25-20","model":"","price":"0","sale_price":"2.5","unit":"个","url":"http://shop.haocaisong.cn/product/app_detail.php?pid=12121&city_id=101","sale_count":0,"sales_type":0,"m_name":[null,null]},{"pid":11468,"tagimg_url":"","tagimg_isshow":false,"image":"http://img.haocaisong.cn/pic/2/7/20779.jpg?x-oss-process=image/resize,m_pad,h_200,w_200","brand_id":208,"brand":"其他","title":"PB过桥弯 (6分)","model_id":"444","_model":"D25","model":"","price":"0","sale_price":"4.5","unit":"个","url":"http://shop.haocaisong.cn/product/app_detail.php?pid=11468&city_id=101","sale_count":0,"sales_type":0,"m_name":[null]}]
         * brand : [{"bid":0,"name":"全部"},{"bid":101,"name":"联塑"},{"bid":208,"name":"其他"}]
         * model : [{"mid":0,"name":"全部"},{"mid":443,"name":"20"},{"mid":444,"name":"25"}]
         * has_more : true
         */

        private boolean has_more;
        private List<ListBean> list;

        public boolean isHas_more() {
            return has_more;
        }

        public void setHas_more(boolean has_more) {
            this.has_more = has_more;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }


        public static class ListBean {
            /**
             * pid : 11777
             * tagimg_url :
             * tagimg_isshow : false
             * image : http://img.haocaisong.cn/pic/2/2/20295.jpg?x-oss-process=image/resize,m_pad,h_200,w_200
             * brand_id : 208
             * brand : 其他
             * title : PB管 (4分)
             * model_id :
             * _model : S3.2 dn20*2.3mm  4m/根
             * model :
             * price : 0
             * sale_price : 30
             * unit : 根
             * url : http://shop.haocaisong.cn/product/app_detail.php?pid=11777&city_id=101
             * sale_count : 0
             * sales_type : 0
             * m_name : [null]
             */

            private int pid;
            private String tagimg_url;
            private boolean tagimg_isshow;
            private String image;
            private int brand_id;
            private String brand;
            private String title;
            private String model_id;
            private String _model;
            private String model;
            private String price;
            private String sale_price;
            private String unit;
            private String url;
            private int sale_count;
            private int sales_type;


            public int getPid() {
                return pid;
            }

            public void setPid(int pid) {
                this.pid = pid;
            }

            public String getTagimg_url() {
                return tagimg_url;
            }

            public void setTagimg_url(String tagimg_url) {
                this.tagimg_url = tagimg_url;
            }

            public boolean isTagimg_isshow() {
                return tagimg_isshow;
            }

            public void setTagimg_isshow(boolean tagimg_isshow) {
                this.tagimg_isshow = tagimg_isshow;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public int getBrand_id() {
                return brand_id;
            }

            public void setBrand_id(int brand_id) {
                this.brand_id = brand_id;
            }

            public String getBrand() {
                return brand;
            }

            public void setBrand(String brand) {
                this.brand = brand;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getModel_id() {
                return model_id;
            }

            public void setModel_id(String model_id) {
                this.model_id = model_id;
            }

            public String get_model() {
                return _model;
            }

            public void set_model(String _model) {
                this._model = _model;
            }

            public String getModel() {
                return model;
            }

            public void setModel(String model) {
                this.model = model;
            }

            public String getPrice() {
                return price;
            }

            public void setPrice(String price) {
                this.price = price;
            }

            public String getSale_price() {
                return sale_price;
            }

            public void setSale_price(String sale_price) {
                this.sale_price = sale_price;
            }

            public String getUnit() {
                return unit;
            }

            public void setUnit(String unit) {
                this.unit = unit;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public int getSale_count() {
                return sale_count;
            }

            public void setSale_count(int sale_count) {
                this.sale_count = sale_count;
            }

            public int getSales_type() {
                return sales_type;
            }

            public void setSales_type(int sales_type) {
                this.sales_type = sales_type;
            }
        }
}
