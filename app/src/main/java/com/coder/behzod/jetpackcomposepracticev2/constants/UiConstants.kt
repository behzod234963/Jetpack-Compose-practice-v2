package com.coder.behzod.jetpackcomposepracticev2.constants

import com.coder.behzod.jetpackcomposepracticev2.R
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted.AdsModel
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted.CategoryModel
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted.NotificationModel
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted.OrdersModel
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted.ProductModel
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted.Programmer

const val SEARCH_RESULT_SCREEN_KEY = "search_result_key"

const val SEARCH_BAR_KEY = "search_bar_key"

const val PROCESSING = "В процессе"

const val DELIVERED = "Доставлено"

const val CANCEL = "Отмена"

val ADS_MODEL = AdsModel(
    1,
    "HP VICTUS",
    "15",
    null,
    "СОЗДАН ДЛЯ",
    "ПРОФЕССИОНАЛОВ",
    "ОТ ПРОФЕССИОНАЛОВ",
    R.drawable.pic_laptop
)

val CATEGORY_MODEL = CategoryModel(
    1,
    "Ноутбуки",
    null,
    R.drawable.ic_laptop_large
)

val SORT_TYPES = mutableListOf(
    "Сначала дешевые",
    "Сначала дорогие",
    "По рейтингу",
    "Популярные"
)

val ALL_PROGRAMMERS = listOf(
    Programmer(
        firstName = "Behzod",
        lastName = "Xudaybergenov"
    ),
    Programmer(
        firstName = "Philipp",
        lastName = "Lackner"
    ),
    Programmer(
        firstName = "Neco",
        lastName = "Desarello"
    ),
    Programmer(
        firstName = "Bogibek",
        lastName = "Matyakubov"
    )
)

val NOTIFICATION_MODEL = NotificationModel(
    1,
    "26-10-2022",
    "С новым 2023 годом",
    "Lorem Ipsum is simply dummy text " +
            "of the printing and typesetting industry. " +
            "Lorem Ipsum has been the industry's standard dummy text " +
            "ever since the 1500s"
)

val ORDERS_MODEL = OrdersModel(
    1,
    "1050017AS",
    "Доставлено",
    "Oct 21,2021"
)

val LOCALE_LIST = mutableListOf("O'z", "Ru")

val PRODUCT_MODEL = ProductModel(
    id = 1,
    "Asus",
    R.drawable.pic_product_image,
    30000,
    5,
    "31",
    false,
    true,
    10000,
    "",
    ""
)

val PRODUCT_LIST = ArrayList<ProductModel>()

val LAPTOPS = "Ноутбуки"

val MONITORS = "Мониторы"

val SMARTPHONES = "Смартфоны"

val ACCESSORIES = "Аксессуары"