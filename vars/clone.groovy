def call(String url, String branch){
  echo "this is cloning the code"
  git url: "${url}", branch:"${url}"
  echo "Code cloning successful"
}
