# Websocket Server

## Introduction
SpringBoot focused example of a websocket server hosted on port 10101.

## Status 
[![CircleCI](https://dl.circleci.com/status-badge/img/gh/andy-jenkins/websocket-server/tree/master.svg?style=svg)](https://dl.circleci.com/status-badge/redirect/gh/andy-jenkins/websocket-server/tree/master)

[![CircleCI](https://dl.circleci.com/insights-snapshot/gh/andy-jenkins/websocket-server/master/integrate/badge.svg?window=30d)](https://app.circleci.com/insights/github/andy-jenkins/websocket-server/workflows/integrate/overview?branch=master&reporting-window=last-30-days&insights-snapshot=true)

## Dependencies
This project depends on the following
compile-time dependencies being installed:
* Java 8 (or greater)
* Gradle 6.8.0 (or greater)

## Testing
The simplest way to check if a websocket is available,
is to perform a cURL via the command line:
```shell
curl \
  --include \
  --no-buffer \
  --header 'Connection: Upgrade' \
  --header 'Upgrade: websocket' \
  --header 'Sec-WebSocket-Key: SGVsbG8sIHdvcmxkIQ==' \
  --header 'Sec-WebSocket-Version: 13' \
  http://localhost:10101/socket
```

The expected response is an upgraded connection:
```
HTTP/1.1 101 
Upgrade: websocket
Connection: upgrade
Sec-WebSocket-Accept: qGEgH3En71di5rrssAZTmtRTyFk=
Date: Mon, 11 Oct 2021 14:13:06 GMT
```
