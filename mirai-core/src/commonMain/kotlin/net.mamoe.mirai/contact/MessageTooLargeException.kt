/*
 * Copyright 2020 Mamoe Technologies and contributors.
 *
 * 此源代码的使用受 GNU AFFERO GENERAL PUBLIC LICENSE version 3 许可证的约束, 可以在以下链接找到该许可证.
 * Use of this source code is governed by the GNU AGPLv3 license that can be found through the following link.
 *
 * https://github.com/mamoe/mirai/blob/master/LICENSE
 */

@file:Suppress("unused")

package net.mamoe.mirai.contact

import net.mamoe.mirai.message.data.Message
import net.mamoe.mirai.utils.SinceMirai

/**
 * 发送消息时消息过长抛出的异常.
 */
@SinceMirai("0.32.0")
class MessageTooLargeException(
    val target: Contact,
    /**
     * 原发送消息
     */
    val originalMessage: Message,
    /**
     * 经过事件拦截处理后的消息
     */
    val messageAfterEvent: Message,
    exceptionMessage: String
) : RuntimeException(exceptionMessage)