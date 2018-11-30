FROM registry.cn-hangzhou.aliyuncs.com/ydx/jre1.8:v1
VOLUME /tmp
RUN mkdir /app
ADD @project.name@-@version.env@-@git.tags@@git.commit.id.describe-short@@git.total.commit.count@.jar /app/@project.name@-@version.env@-@git.tags@@git.commit.id.describe-short@@git.total.commit.count@.jar
EXPOSE 8480
CMD ["/usr/java/bin/java","-jar","/app/@project.name@-@version.env@-@git.tags@@git.commit.id.describe-short@@git.total.commit.count@.jar"]