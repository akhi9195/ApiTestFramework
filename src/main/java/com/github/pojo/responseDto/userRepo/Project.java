package com.github.pojo.responseDto.userRepo;

import java.util.Arrays;

import com.github.pojo.responseDto.search.License;

public class Project {
	private String id;
	private String node_id;
	private String name;
	private String full_name;
	private boolean Private;
	private Owner owner;
	private String html_url;
	private String description;
	private boolean fork;
	private String url;
	private String forks_url;
	private String keys_url;
	private String collaborators_url;
	private String teams_url;
	private String hooks_url;
	private String issue_events_url;
	private String events_url;
	private String assignees_url;
	private String branches_url;
	private String tags_url;
	private String blobs_url;
	private String git_tags_url;
	private String git_refs_url;
	private String trees_url;
	private String statuses_url;
	private String languages_url;
	private String stargazers_url;
	private String contributors_url;
	private String subscribers_url;
	private String subscription_url;
	private String commits_url;
	private String git_commits_url;
	private String comments_url;
	private String issue_comment_url;
	private String contents_url;
	private String compare_url;
	private String merges_url;
	private String archive_url;
	private String downloads_url;
	private String issues_url;
	private String pulls_url;
	private String milestones_url;
	private String notifications_url;
	private String labels_url;
	private String releases_url;
	private String deployments_url;
	private String created_at;
	private String updated_at;
	private String pushed_at;
	private String git_url;
	private String ssh_url;
	private String clone_url;
	private String svn_url;
	private String homepage;
	private long size;
	private int stargazers_count;
	private int watchers_count;
	private String language;
	private boolean has_issues;
	private boolean has_projects;
	private boolean has_downloads;
	private boolean has_wiki;
	private boolean has_pages;
	private int forks_count;
	private String mirror_url;
	private boolean archived;
	private boolean disabled;
	private int open_issues_count;
	private License license;
	private boolean allow_forking;
	private boolean is_template;
	private boolean web_commit_signoff_required;
	private String[] topics;
	private String visibility;
	private int forks;
	private int open_issues;
	private int watchers;
	private String default_branch;
	private int score;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNode_id() {
		return node_id;
	}
	public void setNode_id(String node_id) {
		this.node_id = node_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public boolean isPrivate() {
		return Private;
	}
	public void setPrivate(boolean private1) {
		Private = private1;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public String getHtml_url() {
		return html_url;
	}
	public void setHtml_url(String html_url) {
		this.html_url = html_url;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isFork() {
		return fork;
	}
	public void setFork(boolean fork) {
		this.fork = fork;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getForks_url() {
		return forks_url;
	}
	public void setForks_url(String forks_url) {
		this.forks_url = forks_url;
	}
	public String getKeys_url() {
		return keys_url;
	}
	public void setKeys_url(String keys_url) {
		this.keys_url = keys_url;
	}
	public String getCollaborators_url() {
		return collaborators_url;
	}
	public void setCollaborators_url(String collaborators_url) {
		this.collaborators_url = collaborators_url;
	}
	public String getTeams_url() {
		return teams_url;
	}
	public void setTeams_url(String teams_url) {
		this.teams_url = teams_url;
	}
	public String getHooks_url() {
		return hooks_url;
	}
	public void setHooks_url(String hooks_url) {
		this.hooks_url = hooks_url;
	}
	public String getIssue_events_url() {
		return issue_events_url;
	}
	public void setIssue_events_url(String issue_events_url) {
		this.issue_events_url = issue_events_url;
	}
	public String getEvents_url() {
		return events_url;
	}
	public void setEvents_url(String events_url) {
		this.events_url = events_url;
	}
	public String getAssignees_url() {
		return assignees_url;
	}
	public void setAssignees_url(String assignees_url) {
		this.assignees_url = assignees_url;
	}
	public String getBranches_url() {
		return branches_url;
	}
	public void setBranches_url(String branches_url) {
		this.branches_url = branches_url;
	}
	public String getTags_url() {
		return tags_url;
	}
	public void setTags_url(String tags_url) {
		this.tags_url = tags_url;
	}
	public String getBlobs_url() {
		return blobs_url;
	}
	public void setBlobs_url(String blobs_url) {
		this.blobs_url = blobs_url;
	}
	public String getGit_tags_url() {
		return git_tags_url;
	}
	public void setGit_tags_url(String git_tags_url) {
		this.git_tags_url = git_tags_url;
	}
	public String getGit_refs_url() {
		return git_refs_url;
	}
	public void setGit_refs_url(String git_refs_url) {
		this.git_refs_url = git_refs_url;
	}
	public String getTrees_url() {
		return trees_url;
	}
	public void setTrees_url(String trees_url) {
		this.trees_url = trees_url;
	}
	public String getStatuses_url() {
		return statuses_url;
	}
	public void setStatuses_url(String statuses_url) {
		this.statuses_url = statuses_url;
	}
	public String getLanguages_url() {
		return languages_url;
	}
	public void setLanguages_url(String languages_url) {
		this.languages_url = languages_url;
	}
	public String getStargazers_url() {
		return stargazers_url;
	}
	public void setStargazers_url(String stargazers_url) {
		this.stargazers_url = stargazers_url;
	}
	public String getContributors_url() {
		return contributors_url;
	}
	public void setContributors_url(String contributors_url) {
		this.contributors_url = contributors_url;
	}
	public String getSubscribers_url() {
		return subscribers_url;
	}
	public void setSubscribers_url(String subscribers_url) {
		this.subscribers_url = subscribers_url;
	}
	public String getSubscription_url() {
		return subscription_url;
	}
	public void setSubscription_url(String subscription_url) {
		this.subscription_url = subscription_url;
	}
	public String getCommits_url() {
		return commits_url;
	}
	public void setCommits_url(String commits_url) {
		this.commits_url = commits_url;
	}
	public String getGit_commits_url() {
		return git_commits_url;
	}
	public void setGit_commits_url(String git_commits_url) {
		this.git_commits_url = git_commits_url;
	}
	public String getComments_url() {
		return comments_url;
	}
	public void setComments_url(String comments_url) {
		this.comments_url = comments_url;
	}
	public String getIssue_comment_url() {
		return issue_comment_url;
	}
	public void setIssue_comment_url(String issue_comment_url) {
		this.issue_comment_url = issue_comment_url;
	}
	public String getContents_url() {
		return contents_url;
	}
	public void setContents_url(String contents_url) {
		this.contents_url = contents_url;
	}
	public String getCompare_url() {
		return compare_url;
	}
	public void setCompare_url(String compare_url) {
		this.compare_url = compare_url;
	}
	public String getMerges_url() {
		return merges_url;
	}
	public void setMerges_url(String merges_url) {
		this.merges_url = merges_url;
	}
	public String getArchive_url() {
		return archive_url;
	}
	public void setArchive_url(String archive_url) {
		this.archive_url = archive_url;
	}
	public String getDownloads_url() {
		return downloads_url;
	}
	public void setDownloads_url(String downloads_url) {
		this.downloads_url = downloads_url;
	}
	public String getIssues_url() {
		return issues_url;
	}
	public void setIssues_url(String issues_url) {
		this.issues_url = issues_url;
	}
	public String getPulls_url() {
		return pulls_url;
	}
	public void setPulls_url(String pulls_url) {
		this.pulls_url = pulls_url;
	}
	public String getMilestones_url() {
		return milestones_url;
	}
	public void setMilestones_url(String milestones_url) {
		this.milestones_url = milestones_url;
	}
	public String getNotifications_url() {
		return notifications_url;
	}
	public void setNotifications_url(String notifications_url) {
		this.notifications_url = notifications_url;
	}
	public String getLabels_url() {
		return labels_url;
	}
	public void setLabels_url(String labels_url) {
		this.labels_url = labels_url;
	}
	public String getReleases_url() {
		return releases_url;
	}
	public void setReleases_url(String releases_url) {
		this.releases_url = releases_url;
	}
	public String getDeployments_url() {
		return deployments_url;
	}
	public void setDeployments_url(String deployments_url) {
		this.deployments_url = deployments_url;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}
	public String getPushed_at() {
		return pushed_at;
	}
	public void setPushed_at(String pushed_at) {
		this.pushed_at = pushed_at;
	}
	public String getGit_url() {
		return git_url;
	}
	public void setGit_url(String git_url) {
		this.git_url = git_url;
	}
	public String getSsh_url() {
		return ssh_url;
	}
	public void setSsh_url(String ssh_url) {
		this.ssh_url = ssh_url;
	}
	public String getClone_url() {
		return clone_url;
	}
	public void setClone_url(String clone_url) {
		this.clone_url = clone_url;
	}
	public String getSvn_url() {
		return svn_url;
	}
	public void setSvn_url(String svn_url) {
		this.svn_url = svn_url;
	}
	public String getHomepage() {
		return homepage;
	}
	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long size) {
		this.size = size;
	}
	public int getStargazers_count() {
		return stargazers_count;
	}
	public void setStargazers_count(int stargazers_count) {
		this.stargazers_count = stargazers_count;
	}
	public int getWatchers_count() {
		return watchers_count;
	}
	public void setWatchers_count(int watchers_count) {
		this.watchers_count = watchers_count;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public boolean isHas_issues() {
		return has_issues;
	}
	public void setHas_issues(boolean has_issues) {
		this.has_issues = has_issues;
	}
	public boolean isHas_projects() {
		return has_projects;
	}
	public void setHas_projects(boolean has_projects) {
		this.has_projects = has_projects;
	}
	public boolean isHas_downloads() {
		return has_downloads;
	}
	public void setHas_downloads(boolean has_downloads) {
		this.has_downloads = has_downloads;
	}
	public boolean isHas_wiki() {
		return has_wiki;
	}
	public void setHas_wiki(boolean has_wiki) {
		this.has_wiki = has_wiki;
	}
	public boolean isHas_pages() {
		return has_pages;
	}
	public void setHas_pages(boolean has_pages) {
		this.has_pages = has_pages;
	}
	public int getForks_count() {
		return forks_count;
	}
	public void setForks_count(int forks_count) {
		this.forks_count = forks_count;
	}
	public String getMirror_url() {
		return mirror_url;
	}
	public void setMirror_url(String mirror_url) {
		this.mirror_url = mirror_url;
	}
	public boolean isArchived() {
		return archived;
	}
	public void setArchived(boolean archived) {
		this.archived = archived;
	}
	public boolean isDisabled() {
		return disabled;
	}
	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}
	public int getOpen_issues_count() {
		return open_issues_count;
	}
	public void setOpen_issues_count(int open_issues_count) {
		this.open_issues_count = open_issues_count;
	}
	public License getLicense() {
		return license;
	}
	public void setLicense(License license) {
		this.license = license;
	}
	public boolean isAllow_forking() {
		return allow_forking;
	}
	public void setAllow_forking(boolean allow_forking) {
		this.allow_forking = allow_forking;
	}
	public boolean isIs_template() {
		return is_template;
	}
	public void setIs_template(boolean is_template) {
		this.is_template = is_template;
	}
	public boolean isWeb_commit_signoff_required() {
		return web_commit_signoff_required;
	}
	public void setWeb_commit_signoff_required(boolean web_commit_signoff_required) {
		this.web_commit_signoff_required = web_commit_signoff_required;
	}
	public String[] getTopics() {
		return topics;
	}
	public void setTopics(String[] topics) {
		this.topics = topics;
	}
	public String getVisibility() {
		return visibility;
	}
	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}
	public int getForks() {
		return forks;
	}
	public void setForks(int forks) {
		this.forks = forks;
	}
	public int getOpen_issues() {
		return open_issues;
	}
	public void setOpen_issues(int open_issues) {
		this.open_issues = open_issues;
	}
	public int getWatchers() {
		return watchers;
	}
	public void setWatchers(int watchers) {
		this.watchers = watchers;
	}
	public String getDefault_branch() {
		return default_branch;
	}
	public void setDefault_branch(String default_branch) {
		this.default_branch = default_branch;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Project(String id, String node_id, String name, String full_name, boolean private1, Owner owner,
			String html_url, String description, boolean fork, String url, String forks_url, String keys_url,
			String collaborators_url, String teams_url, String hooks_url, String issue_events_url, String events_url,
			String assignees_url, String branches_url, String tags_url, String blobs_url, String git_tags_url,
			String git_refs_url, String trees_url, String statuses_url, String languages_url, String stargazers_url,
			String contributors_url, String subscribers_url, String subscription_url, String commits_url,
			String git_commits_url, String comments_url, String issue_comment_url, String contents_url,
			String compare_url, String merges_url, String archive_url, String downloads_url, String issues_url,
			String pulls_url, String milestones_url, String notifications_url, String labels_url, String releases_url,
			String deployments_url, String created_at, String updated_at, String pushed_at, String git_url,
			String ssh_url, String clone_url, String svn_url, String homepage, long size, int stargazers_count,
			int watchers_count, String language, boolean has_issues, boolean has_projects, boolean has_downloads,
			boolean has_wiki, boolean has_pages, int forks_count, String mirror_url, boolean archived, boolean disabled,
			int open_issues_count, License license, boolean allow_forking, boolean is_template,
			boolean web_commit_signoff_required, String[] topics, String visibility, int forks, int open_issues,
			int watchers, String default_branch, int score) {
		super();
		this.id = id;
		this.node_id = node_id;
		this.name = name;
		this.full_name = full_name;
		Private = private1;
		this.owner = owner;
		this.html_url = html_url;
		this.description = description;
		this.fork = fork;
		this.url = url;
		this.forks_url = forks_url;
		this.keys_url = keys_url;
		this.collaborators_url = collaborators_url;
		this.teams_url = teams_url;
		this.hooks_url = hooks_url;
		this.issue_events_url = issue_events_url;
		this.events_url = events_url;
		this.assignees_url = assignees_url;
		this.branches_url = branches_url;
		this.tags_url = tags_url;
		this.blobs_url = blobs_url;
		this.git_tags_url = git_tags_url;
		this.git_refs_url = git_refs_url;
		this.trees_url = trees_url;
		this.statuses_url = statuses_url;
		this.languages_url = languages_url;
		this.stargazers_url = stargazers_url;
		this.contributors_url = contributors_url;
		this.subscribers_url = subscribers_url;
		this.subscription_url = subscription_url;
		this.commits_url = commits_url;
		this.git_commits_url = git_commits_url;
		this.comments_url = comments_url;
		this.issue_comment_url = issue_comment_url;
		this.contents_url = contents_url;
		this.compare_url = compare_url;
		this.merges_url = merges_url;
		this.archive_url = archive_url;
		this.downloads_url = downloads_url;
		this.issues_url = issues_url;
		this.pulls_url = pulls_url;
		this.milestones_url = milestones_url;
		this.notifications_url = notifications_url;
		this.labels_url = labels_url;
		this.releases_url = releases_url;
		this.deployments_url = deployments_url;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.pushed_at = pushed_at;
		this.git_url = git_url;
		this.ssh_url = ssh_url;
		this.clone_url = clone_url;
		this.svn_url = svn_url;
		this.homepage = homepage;
		this.size = size;
		this.stargazers_count = stargazers_count;
		this.watchers_count = watchers_count;
		this.language = language;
		this.has_issues = has_issues;
		this.has_projects = has_projects;
		this.has_downloads = has_downloads;
		this.has_wiki = has_wiki;
		this.has_pages = has_pages;
		this.forks_count = forks_count;
		this.mirror_url = mirror_url;
		this.archived = archived;
		this.disabled = disabled;
		this.open_issues_count = open_issues_count;
		this.license = license;
		this.allow_forking = allow_forking;
		this.is_template = is_template;
		this.web_commit_signoff_required = web_commit_signoff_required;
		this.topics = topics;
		this.visibility = visibility;
		this.forks = forks;
		this.open_issues = open_issues;
		this.watchers = watchers;
		this.default_branch = default_branch;
		this.score = score;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", node_id=" + node_id + ", name=" + name + ", full_name=" + full_name
				+ ", Private=" + Private + ", owner=" + owner + ", html_url=" + html_url + ", description="
				+ description + ", fork=" + fork + ", url=" + url + ", forks_url=" + forks_url + ", keys_url="
				+ keys_url + ", collaborators_url=" + collaborators_url + ", teams_url=" + teams_url + ", hooks_url="
				+ hooks_url + ", issue_events_url=" + issue_events_url + ", events_url=" + events_url
				+ ", assignees_url=" + assignees_url + ", branches_url=" + branches_url + ", tags_url=" + tags_url
				+ ", blobs_url=" + blobs_url + ", git_tags_url=" + git_tags_url + ", git_refs_url=" + git_refs_url
				+ ", trees_url=" + trees_url + ", statuses_url=" + statuses_url + ", languages_url=" + languages_url
				+ ", stargazers_url=" + stargazers_url + ", contributors_url=" + contributors_url + ", subscribers_url="
				+ subscribers_url + ", subscription_url=" + subscription_url + ", commits_url=" + commits_url
				+ ", git_commits_url=" + git_commits_url + ", comments_url=" + comments_url + ", issue_comment_url="
				+ issue_comment_url + ", contents_url=" + contents_url + ", compare_url=" + compare_url
				+ ", merges_url=" + merges_url + ", archive_url=" + archive_url + ", downloads_url=" + downloads_url
				+ ", issues_url=" + issues_url + ", pulls_url=" + pulls_url + ", milestones_url=" + milestones_url
				+ ", notifications_url=" + notifications_url + ", labels_url=" + labels_url + ", releases_url="
				+ releases_url + ", deployments_url=" + deployments_url + ", created_at=" + created_at + ", updated_at="
				+ updated_at + ", pushed_at=" + pushed_at + ", git_url=" + git_url + ", ssh_url=" + ssh_url
				+ ", clone_url=" + clone_url + ", svn_url=" + svn_url + ", homepage=" + homepage + ", size=" + size
				+ ", stargazers_count=" + stargazers_count + ", watchers_count=" + watchers_count + ", language="
				+ language + ", has_issues=" + has_issues + ", has_projects=" + has_projects + ", has_downloads="
				+ has_downloads + ", has_wiki=" + has_wiki + ", has_pages=" + has_pages + ", forks_count=" + forks_count
				+ ", mirror_url=" + mirror_url + ", archived=" + archived + ", disabled=" + disabled
				+ ", open_issues_count=" + open_issues_count + ", license=" + license + ", allow_forking="
				+ allow_forking + ", is_template=" + is_template + ", web_commit_signoff_required="
				+ web_commit_signoff_required + ", topics=" + Arrays.toString(topics) + ", visibility=" + visibility
				+ ", forks=" + forks + ", open_issues=" + open_issues + ", watchers=" + watchers + ", default_branch="
				+ default_branch + ", score=" + score + "]";
	}
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

}
