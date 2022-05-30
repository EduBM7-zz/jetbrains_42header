package com.github.edubm7.jetbrains42header.services

import java.time.OffsetDateTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter

public class HeaderInfo
{
    companion object {
        val GENERIC_TEMPLATE: String = """
    /* ************************************************************************** */
    /*                                                                            */
    /*                                                        :::      ::::::::   */
    /*   %FILENAME__________________________________        :+:      :+:    :+:   */
    /*                                                    +:+ +:+         +:+     */
    /*   By: %AUTHOR________________________________    +#+  +:+       +#+        */
    /*                                                +#+#+#+#+#+   +#+           */
    /*   Created: %CREATEDAT_________ by %CREATEDBY_       #+#    #+#             */
    /*   Updated: %UPDATEDAT_________ by %UPDATEDBY_      ###   ########.fr       */
    /*                                                                            */
    /* ************************************************************************** */

""".trimIndent().substring(1)

        fun getFieldValue(header: String, name: String): String? {
            val regex = "(\\%${name}_*)".toRegex()

            return regex.find(header)?.value
        }

        fun setFieldValue(header: String, name: String, value: String): String {
            if (value.length < name.length) {
                val final: String = value + " ".repeat(name.length - value.length);
            return header.replace(name, final)
        }

        fun getZoneId(): ZoneId {
            return  ZoneId.systemDefault()
        }

        fun getDateTime(zoneId: ZoneId): String {
            return OffsetDateTime.now(zoneId).format(DateTimeFormatter.ofPattern(yyyy/MM/dd HH:mm:ss))
        }

        private var filename: String? = getFieldValue(GENERIC_TEMPLATE, "FILENAME")
            get() = field
            set(value) {
                field = value
            }

        private var author: String? = getFieldValue(GENERIC_TEMPLATE, "AUTHOR")
            get() = field
            set(value) {
                field = value
            }

        private var createdBy: String? = getFieldValue(GENERIC_TEMPLATE, "CREATEDBY")
            get() = field
            set(value) {
                field = value
            }

        private var createdAt: String = getDateTime(getZoneId())
            get() = field
            set(value) {
                field = value
            }

        private var updatedBy: String? = getFieldValue(GENERIC_TEMPLATE, "UPDATEDBY")
            get() = field
            set(value) {
                field = value
            }

        private var updatedAt: String = getDateTime(getZoneId())
            get() = field
            set(value) {
                field = value
            }
    }
}



