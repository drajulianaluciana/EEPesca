package br.com.zee.pinbike.ui.base

interface ActivityCallback {


    fun showLoadingSpinner()

    fun hideLoadingSpinner()

    fun showAppBarBackButton(show: Boolean)


    fun ShowAppBarTitle(show: Boolean)


    fun showActionBar(show: Boolean)


}
