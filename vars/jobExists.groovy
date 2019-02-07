import jenkins.model.Jenkins

@NonCPS
def call(String name) {
  def instance = jenkins.model.Jenkins.instance
  return instance.getItemByFullName(name) != null
}
