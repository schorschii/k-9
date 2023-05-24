package app.k9mail.autodiscovery.api

import app.k9mail.core.common.net.Hostname
import app.k9mail.core.common.net.Port

data class SmtpServerSettings(
    val hostname: Hostname,
    val port: Port,
    val connectionSecurity: ConnectionSecurity,
    val authenticationType: AuthenticationType,
    val username: String,
) : OutgoingServerSettings
