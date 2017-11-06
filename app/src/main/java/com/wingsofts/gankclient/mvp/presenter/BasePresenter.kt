package com.wingsofts.gankclient.mvp.presenter

import rx.Subscription
import rx.subscriptions.CompositeSubscription

/**
 * Created by wing on 16-11-24.
 */
open class BasePresenter {
    var compositeSubscription = CompositeSubscription()

    protected fun addSubscription(subscription: Subscription) {
        compositeSubscription.add(subscription)
    }

    fun unSubscribe() {
        if (compositeSubscription.hasSubscriptions()) {
            compositeSubscription.unsubscribe()
        }
    }
}