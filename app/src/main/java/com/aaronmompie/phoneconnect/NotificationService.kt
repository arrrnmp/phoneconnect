package com.aaronmompie.phoneconnect

import android.service.notification.NotificationListenerService
import android.service.notification.StatusBarNotification
import android.util.Log

/**
 * NotificationService listens for all posted and removed notifications on the device.
 * This can be extended to forward notifications to a desktop client via TCP or other means.
 */
class NotificationService : NotificationListenerService() {
    override fun onNotificationPosted(sbn: StatusBarNotification?) {
        super.onNotificationPosted(sbn)
        Log.d("NotificationService", "Notification received: ${sbn?.notification?.tickerText}")
        // TODO: Bridge to TCP server for macOS client
    }

    override fun onNotificationRemoved(sbn: StatusBarNotification?) {
        super.onNotificationRemoved(sbn)
        Log.d("NotificationService", "Notification removed")
    }
}
