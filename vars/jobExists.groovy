// Copyright (C) 2019 The Software Heritage developers
// License: MIT/Expat
// See top-level LICENSE file for more information

import jenkins.model.Jenkins

@NonCPS
def call(String name) {
  def instance = jenkins.model.Jenkins.instance
  return instance.getItemByFullName(name) != null
}
