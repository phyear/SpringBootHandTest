#!/bin/bash

echo "开始打包..."

docker build -t mysql:test ./docker/mysql



docker build -t java:test ./docker/java
