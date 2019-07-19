FROM registry.saas.hand-china.com/tools/mysql:5.6

#设置mysql的工作目录
ENV WORK_PATH /usr/local/

#自动执行的目录
ENV AUTO_RUN_DIR /docker-entrypoint-initdb.d

ENV FILE_0 sakila-schema.sql
ENV FILE_1 sakila-data.sql

#导入数据文件
ENV INSTALL_DATA_SHELL docker-entrypoint.sh

COPY ./$FILE_0 $WORK_PATH/
COPY ./$FILE_1 $WORK_PATH/

COPY ./$INSTALL_DATA_SHELL $AUTO_RUN_DIR/

RUN chmod a+x $AUTO_RUN_DIR/$INSTALL_DATA_SHELL

