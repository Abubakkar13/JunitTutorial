./mvnw site

path=$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)
report_path="${path}/target/site/surefire-report.html"
echo "Test reports can be found at file://${report_path}"