/* @Provengo summon selenium */

defineEvent(SeleniumSession, "loginAdmin", function(session, e) {
  bp.log.info(e);
  session.writeText("//input[@id='Email']", e.email);
  session.writeText("//input[@id='Password']", e.password);
  session.click("//button[normalize-space()='Accept']");
  session.click("//button[normalize-space()='Log in']");
})

defineEvent(SeleniumSession, "loginUser", function(session, e) {
  bp.log.info(e);
  session.writeText("//input[@id='Email']", e.email);
  session.writeText("//input[@id='Password']", e.password);
  session.click("//button[normalize-space()='Accept']");
  session.click("//button[normalize-space()='Log in']");
})

defineEvent(SeleniumSession, "navigateToProducts", function(session, e) {
  bp.log.info(e);
  session.click("//a[normalize-space()='Dashboard']");
  session.click("//a[normalize-space()='Catalog']");
  session.click("//a[normalize-space()='Products']");
})

defineEvent(SeleniumSession, "createProduct", function(session, e) {
  bp.log.info(e);
  session.click("//a[normalize-space()='Create Product']");
  session.writeText("//input[@name='name']", e.name);
  session.writeText("//input[@name='price']", e.price, true);
  session.click("(//button[normalize-space()='Save'])[1]");
})

defineEvent(SeleniumSession, "deleteProduct", function(session, e) {
  bp.log.info(e);
  session.click("(//span[@class='glyphicon glyphicon-remove'])[1]");
  session.click("(//button[normalize-space()='OK'])[1]");
})

defineEvent(SeleniumSession, "navigateToTheProduct", function(session, e) {
  bp.log.info(e);
  session.click("//h5[normalize-space()='Iphone 100!']");
  session.click("//a[normalize-space()='Add Review']");
})

defineEvent(SeleniumSession, "addReview", function(session, e) {
  bp.log.info(e);
  session.runCode("$('#Rating').get(0).value = '5';")
  session.writeText("//textarea[@id='Comment']", e.comment);
  session.writeText("//input[@id='Title']", e.title, true);
  session.click("//button[@id='btn-addreview']");
})


