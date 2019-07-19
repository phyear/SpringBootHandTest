#!/bin/bash
echo '开始执行sql文件'
mysql -uroot -p12345 <<EOF

source $WORK_PATH/sakila-schema.sql;

source $WORK_PATH/sakila-data.sql;

EOF