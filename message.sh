for i in {1..20}
do
  curl -X POST \
    http://localhost:8080/rabbit \
    -H 'Content-Type: text/plain' \
    -d "$i"
done
