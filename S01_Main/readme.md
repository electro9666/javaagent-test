# 매번 agent소스코드를 수정하고, agent.jar를 만들지 않고 테스트 하는 방법
agent소스코드는 내부에 포함하고, manifest.txt만 들어있는 jar를 만든다.
https://stackoverflow.com/questions/34741613/how-to-debug-a-java-agent

jar -cmf manifest.txt myagent.jar

# MyMain실행
# VM arguments에 추가
-javaagent:F:\workspace2020\javaagent-test\S01_Main\myagent.jar

