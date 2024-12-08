DESCRIPTION = "udev rules for Freescale i.MX SOCs"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = " file://10-imx.rules"

do_install () {
    install -D -m 0644 ${WORKDIR}/10-imx.rules \
                       ${D}${sysconfdir}/udev/rules.d/10-imx.rules
}
