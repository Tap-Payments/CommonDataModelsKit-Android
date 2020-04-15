package company.tap.commondatamodelskit_android

/**
 *
 * Created by Mario Gamal on 4/15/20
 * Copyright © 2020 Tap Payments. All rights reserved.
 *
 */
data class Expiry (
    var month: String,
    var year: String
) {
    override fun toString(): String {
        return "$month/$year"
    }
}