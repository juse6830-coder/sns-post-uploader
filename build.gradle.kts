# 1. 저장소 클론
git clone https://github.com/juse6830-coder/sns-post-uploader.git
cd sns-post-uploader

# 2. 프로젝트 디렉토리 구조 생성
mkdir -p app/src/main/java/com/snspostuploader/{model,billing,service,viewmodel,ui/{screen,components,theme}}
mkdir -p app/src/main/res/values
mkdir -p .github/workflows

# 3. 모든 파일을 위 경로에 복사 (위에서 제공한 파일들)
# 파일을 복사하려면:
# - build.gradle.kts (프로젝트 루트)
# - app/build.gradle.kts
# - settings.gradle.kts
# - app/src/main/AndroidManifest.xml
# - app/src/main/java/com/snspostuploader/model/*.kt
# - app/src/main/java/com/snspostuploader/billing/*.kt
# 등등 모든 파일을...

# 4. 커밋 및 푸시
git add .
git commit -m "Add complete project structure: models, services, viewmodel, UI components"
git push origin main
