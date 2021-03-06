package uz.ferganagroup.arzonibizdadelivery.utils

class Constants{
    companion object{
        const val HOST = "http://91.196.77.110:60020/MobilTest/odata/standard.odata/"
        const val HOST_OFFER = "http://ilm-markaz.uz/perspectives/offers/opencontent/support/"

        const val START_FRAGMENT = "start_fragment"

        const val EXTRA_DATA = "extra_data"
        const val EXTRA_DATA_2 = "extra_data_2"
        const val EXTRA_DATA_START_FRAGMENT = "extra_data_start_fragment"

        const val FRAGMENT_HOME = 0
        const val FRAGMENT_ORDERS = 1
        const val FRAGMENT_MANUFACTURER = 2
        const val FRAGMENT_SETTINGS = 3

        const val EVENT_UPDATE_MY_ORDERS = 0
        const val EVENT_UPDATE_BASKET = 1
        const val EVENT_UPDATE_FAVOURITES = 2
        const val EVENT_UPDATE_CART = 3
    }
}