SUMMARY = "Socket.IO integration for Flask applications"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=38cc21254909604298ce763a6e4440a0"

PYPI_PACKAGE = "Flask-SocketIO"

RDEPENDS_${PN} = " \
  python-flask \
  python-socketio \
  python-gevent-websocket \
"

SRC_URI[md5sum] = "939dcbc27ba58dee3cb5c6575683cf61"
SRC_URI[sha256sum] = "034c36bad808f93efd5b0aeafd740dc314b0a848f17e9ec6c387c74b3f22dfe7"

PR = "r0"

inherit pypi setuptools
