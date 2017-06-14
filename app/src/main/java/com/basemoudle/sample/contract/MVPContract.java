package com.basemoudle.sample.contract;

import com.basemoudle.sample.bean.User;
import com.xusangbo.basemoudle.base.BaseModel;
import com.xusangbo.basemoudle.base.BasePresenter;
import com.xusangbo.basemoudle.base.BaseRespose;
import com.xusangbo.basemoudle.base.BaseView;

import io.reactivex.Flowable;

/**
 * Created by boxu on 2017/4/24.
 */

public interface MVPContract {

    interface Model extends BaseModel {

        Flowable<BaseRespose<User>> postData();
    }

    interface View extends BaseView {

    }

    abstract static class Presenter extends BasePresenter<MVPContract.View, MVPContract.Model> {
        public abstract void postData();

    }
}
